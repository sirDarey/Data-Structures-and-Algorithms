package singlyLinkedList;
/**
 *
 * @author Sir Darey
 */
public class b9_RemoveLoop {
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
   
    static boolean detectLoop () {
        if (head==null) {
            System.out.println("Linked List is Empty");
            return false;
        }
        
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        
        while (fastPtr!=null && fastPtr.next!=null){
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if (fastPtr == slowPtr){
                removeLoop(slowPtr);
                return true;
            }
                
        }
    
        return false;
    }
    
    static void removeLoop (ListNode slowPtr) {
        
        ListNode loopStart = head;
        
        while (loopStart.next!=slowPtr.next) {
            slowPtr = slowPtr.next;
            loopStart = loopStart.next;
        }
        
        System.out.println("Loop is Present \nRemoving Loop...");
        slowPtr.next = null;
        display();
        
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
       sixth.next = third;
      
       if (!detectLoop())
           System.out.println("\nLoop is Absent");
           
    }
    
}
