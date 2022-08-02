package singlyLinkedList;
/**
 *
 * @author Sir Darey
 */
public class b5_InsertNodeInSorted {
    private static ListNode head;
    
    private static class ListNode  {
        private final int data;
        private ListNode  next;
        
        public ListNode (int data) {
            this.data = data;
            next = null;
        }
    }
    
    static void display () {
        ListNode current = head;
        
        while (current!=null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        
        System.out.println("null");
    }
   
    static void insertNode(ListNode newNode) {
        if (head==null) {
            System.out.println("Linked List is Empty");
            return;
        }
        
        ListNode current = head;
        ListNode temp = null;
        
        if (current.data >= newNode.data) {
            head = newNode;
            newNode.next = current;
            return;
        }
        
        while (current!=null && current.data < newNode.data) {
            temp = current;
            current = current.next;
        }
        
        newNode.next = current;
        temp.next = newNode;
    }
    
    public static void main(String[] args) {
        
       //Creating  the nodes
       head = new ListNode(2);
       ListNode second = new ListNode(3);
       ListNode third = new ListNode(4);
       ListNode fourth = new ListNode(7);
       ListNode fifth = new ListNode(10);
       ListNode sixth = new ListNode(12);
       
       //Linking them together
       head.next = second;
       second.next = third;
       third.next = fourth;
       fourth.next =  fifth;
       fifth.next = sixth;
       
       System.out.println("The Sorted Linked List is as shown below:");                              
       display();
       
       insertNode(new  ListNode(1));
       System.out.println("\nInserting newNode, The Sorted Linked List Becomes:");                              
       display();
       
    }
    
}
