package singlyLinkedList;
/**
 *
 * @author Sir Darey
 */
public class a7_DeleteLastNode {
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
        System.out.print("Current Linked List: ");
        while (current!=null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        
        System.out.println("null");
    }
    
    static void newHead (int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
    }
    
    static void deleteLastNode () {
        if (head==null) {
            System.out.println("\nLinked List is Empty, There's no Node to Delete");
        }else {
            ListNode current = head;
            
            if (current.next==null) 
                head = null;
            else {
                ListNode previous = null;
                while(current.next!=null) {
                    previous = current;
                    current = current.next;   
                }
                previous.next = null;
            }
            
            System.out.println("\nDeleted Last Node with data: "+current.data);
            display();
        }            
    }
    
    public static void main(String[] args) {
        System.out.println("Creating a Linked List via a forLoop with data from 1-4");
       
        for (int i = 4; i>0; i--) {
            System.out.println("\nAdding a New Head Node with data " +i);
            newHead(i);
            display(); 
        }
        
        deleteLastNode();
        deleteLastNode();
        deleteLastNode();
        deleteLastNode();
        deleteLastNode();
    }
    
}
