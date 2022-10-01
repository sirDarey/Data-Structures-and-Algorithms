package singlyLinkedList;
/**
 *
 * @author Sir Darey
 */
public class b2_GetMiddleNode {
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
    
    static void getMiddleNode () {
        if (head ==null) {
            System.out.println("Linked List is Empty");
            return;
        }
        
        ListNode fast = head;
        ListNode slow = head;
        ListNode slowPrevious = null;
        
        int count = 1;
        while (fast!=null && fast.next!=null) {
            slowPrevious = slow;
            slow = slow.next;
            fast = fast.next.next;
            count++;
        }
        
        if (linkedListLength()%2==0) {
            System.out.println("\nMiddle Nodes are at Positions: "+
                    (count-1)+ " and "+ count+ 
                    " with Data: "+slowPrevious.data +" and " +slow.data +
                    " Respectiveely");
        } else 
            System.out.println("\nMiddle Node is at position: "+count+ " with data: "+slow.data);
    }
    
    static void newHead (int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
    }
    
    public static void main(String[] args) {
        
       System.out.println("Creating a Linked List via a forLoop with data from 1 - 6");
       
        for (int i = 10; i>0; i--) {
            System.out.println("\nAdding a New Head Node with data " +i);
            newHead(i);
            display(); 
        }
       
        getMiddleNode();
    }
    
}
 