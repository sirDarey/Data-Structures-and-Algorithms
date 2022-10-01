package singlyLinkedList;
/**
 *
 * @author Sir Darey
 */
public class c1_MergeTwoSorted {
    
    private ListNode head;
    
    private static class ListNode  {
        private final int data;
        private ListNode  next;
        
        public ListNode (int data) {
            this.data = data;
            next = null;
        }
    }
    
    void display () {
        ListNode current = head;
        
        while (current!=null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        
        System.out.println("null");
    }
   
    void newLast (int data) {
        ListNode newNode = new ListNode(data);
        
        if (head==null){
            head = newNode;
            return;
        }
        
        ListNode current = head;
        while (current.next!=null) {
            current = current.next;
        }
        current.next = newNode;
    }
    
    static ListNode mergeSortedLists (ListNode head1, ListNode head2) {
        ListNode head;
        
        if (head1.data <= head2.data){
            head = head1;
            head1 = head1.next;
        } else {
            head = head2;
            head2 = head2.next;
        }
        
        ListNode tail = head;
        
        while(head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                tail.next = head1;
                head1 = head1.next;
            } else {
                tail.next = head2;
                head2 = head2.next;
            }
            
            tail = tail.next;
        }
        
        if (head1==null) {
            tail.next = head2;
        }else {
            tail.next = head1;
        }
        
        return head;
        
    }
   
    
    public static void main(String[] args) {
        
       //Creating the First Linked List
       c1_MergeTwoSorted list1 = new c1_MergeTwoSorted();
       list1.newLast(1);
       list1.newLast(2);
       list1.newLast(3);
       list1.newLast(5);
       list1.newLast(9);
       list1.newLast(10);
       
       //Creating the Second Linked List
       c1_MergeTwoSorted list2 = new c1_MergeTwoSorted();
       list2.newLast(4);
       list2.newLast(8);
       
       list1.display();
       list2.display();
       
       c1_MergeTwoSorted result = new c1_MergeTwoSorted();
       System.out.println("Merging Lists....\n");
       result.head = mergeSortedLists(list1.head, list2.head);
       result.display();            
    }
    
}
