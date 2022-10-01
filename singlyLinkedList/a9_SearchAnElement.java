package singlyLinkedList;
/**
 *
 * @author Sir Darey
 */
public class a9_SearchAnElement {
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
    
    static void newHead (int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
    }
    
    static void searchElement(int searchKey) {
        if (head==null) 
            System.out.println("Linked List is Empty, There's Nothing to Search");
        else {
            ListNode current = head;
            
            while(current!=null) {
                if (current.data==searchKey) {
                    System.out.println("\nSearch Key: "+searchKey +" Found!!!");
                    return;
                } 
                current = current.next;   
            }
            
            System.out.println("\nSearch  Key Not Found!!!");
        }
    }
    
    public static void main(String[] args) {
        
        System.out.println("Creating a Linked List via a forLoop with data from 1-4 \n");
       
        for (int i = 4; i>0; i--) {
            System.out.println("Adding a New Head Node with data " +i);
            newHead(i);
            display(); 
        }   
        
        searchElement(5);
    }
    
}
 