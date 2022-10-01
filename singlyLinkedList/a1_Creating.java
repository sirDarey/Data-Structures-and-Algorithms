package singlyLinkedList;
/**
 *
 * @author Sir Darey
 */
public class a1_Creating {
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
   
    
    public static void main(String[] args) {
        
       //Creating  the nodes
       head = new ListNode(10);
       ListNode second = new ListNode(1);
       ListNode third = new ListNode(8);
       ListNode fourth = new ListNode(11);
       
       //Linking them together
       head.next = second;
       second.next = third;
       third.next = fourth;
       
       System.out.println("The Linked List is as shown below:");                              
       display();
    }
    
}
