package singlyLinkedList;
/**
 *
 * @author Sir Darey
 */
public class b4_RemoveDuplicateFromSorted {
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
   
    static void removeDuplicate() {
        if (head==null) {
            System.out.println("Linked List is Empty");
            return;
        }
        
        ListNode current = head;
        while (current!=null && current.next!=null) {
            if(current.data == current.next.data) 
                current.next = current.next.next;
            else
                current = current.next;
        }
    }
    
    public static void main(String[] args) {
        
       //Creating  the nodes
       head = new ListNode(1);
       ListNode second = new ListNode(5);
       ListNode third = new ListNode(5);
       ListNode fourth = new ListNode(7);
       ListNode fifth = new ListNode(12);
       ListNode sixth = new ListNode(12);
       
       //Linking them together
       head.next = second;
       second.next = third;
       third.next = fourth;
       fourth.next =  fifth;
       fifth.next = sixth;
       
       System.out.println("The Sorted Linked List is as shown below:");                              
       display();
       
       removeDuplicate();
       System.out.println("\nAfter Removing Duplicates, The Sorted Linked List Becomes:");                              
       display();
       
    }
    
}
