package singlyLinkedList;
/**
 *
 * @author Sir Darey
 */
public class b6_removeKey {
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
   
    static void removeKey(int key) {
        if (head==null) {
            System.out.println("Linked List is Empty");
            return;
        }
        
        ListNode current = head;
        ListNode temp = null;
        
        if (current.data==key) {
            head = current.next;
            return;
        }
                   
        while (current!=null && current.data != key) {
            temp = current;
            current = current.next;
        }
        
        if (current==null)
            System.out.println("\nNo Matches Found!!!");
        else 
            temp.next = current.next;
    }
    
    public static void main(String[] args) {
        
       //Creating  the nodes
       head = new ListNode(1);
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
       
       System.out.println("The Linked List is as shown below:");                              
       display();
       
       removeKey(7); 
       System.out.println("\nThe Linked List Becomes:");
       display();
       
    }
    
}
