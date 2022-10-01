package singlyLinkedList;
/**
 *
 * @author Sir Darey
 */
public class b1_ReverseALinkedList {
    static ListNode head;
    
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
        System.out.print("Current Linked List: ");
        while (current!=null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        
        System.out.println("null");
    }
  
    static void reverseLinkedList () {
        if (head == null) 
            return;
                
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;
        
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }       
        
        head = previous; //Assigns previous as the new Head of the ReversedLinkedList
    }
    
    static void newHead (int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
    }
    
    public static void main(String[] args) {
        
       System.out.println("Creating a Linked List via a forLoop with data from 1 - 6");
       
        for (int i = 6; i>0; i--) {
            System.out.println("\nAdding a New Head Node with data " +i);
            newHead(i);
            display(); 
        }
       
       reverseLinkedList();
       
       System.out.println("\nThe Reversed Linked List is as shown below:"); 
       display();
       
    }
    
}
 