package singlyLinkedList;
/**
 *
 * @author Sir Darey
 */
public class b3_FindNthNodeFromTheEnd {
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
    
    static ListNode getNthNodeFromEnd (int n) {
        if (head ==null) {
            System.out.println("Linked List is Empty");
            return null;
        }
        
        if (n<=0)
            throw new IllegalArgumentException("Invalid Argument: n = " +n);
        
        ListNode reference = head;
        ListNode nthNode = head;
        int count = 0;
        
        while (count < n) {
            if (reference == null)
                throw new IllegalArgumentException("Invalid Argument: "+n+
                        " is greater than the length of Linked List");
            reference = reference.next;
            count++;
        }
        
        while  (reference!=null) {
            reference = reference.next;
            nthNode = nthNode.next;
        }
        
        return nthNode;
    }
    
    static void newHead (int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
    }
    
    public static void main(String[] args) {
        
       System.out.println("Creating a Linked List via a forLoop");
       
        for (int i = 10; i>0; i--) {
            System.out.println("\nAdding a New Head Node with data " +i);
            newHead(i);
            display(); 
        }
       
        int position = 2;
        System.out.println("\nThe node at postion: " +position+ " from the End is: "
                +getNthNodeFromEnd(position).data);
    }
    
}
 