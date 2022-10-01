package singlyLinkedList;
/**
 *
 * @author Sir Darey
 */
public class a4_InsertNewLast {
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
    
    static void newLast (int data) {
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
    
    public static void main(String[] args) {
       
       System.out.println("Creating a Linked List via a forLoop with data from 1-4 \n"); 
       
       System.out.println("\nInserting newNodes at the end via a forLoop with data from 1-4 \n");
       for (int i = 1; i<5; i++) {
           System.out.println("Adding a New Last Node with data " +i);
           newLast(i);
           display();
       }
         
    }
    
}
