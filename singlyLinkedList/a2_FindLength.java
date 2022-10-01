package singlyLinkedList;

/**
 *
 * @author Sir Darey
 */
public class a2_FindLength {
    private static ListNode head;
    
    private static class ListNode  {
        private ListNode  next;
        
        public ListNode (int data) {
            next = null;
        }
    }
    
    static int linkedListLength () {
        if (head == null)
            return 0;
        
        int count = 0;
        ListNode current = head;
        while (current!=null) {
            count++;
            current = current.next;
        }
        return count;
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
       
       System.out.println("\nThe LENGTH of the Linked List is -> " +linkedListLength() +"\n");
    }
}
