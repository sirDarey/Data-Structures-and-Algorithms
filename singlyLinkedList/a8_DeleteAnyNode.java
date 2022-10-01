package singlyLinkedList;
/**
 *
 * @author Sir Darey
 */
public class a8_DeleteAnyNode {
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
    
    static int findLength () {
        int count = 0;
        
        ListNode current = head;
        while (current!=null){
            current = current.next;
            count++;
        }
        return count;
    }
    
    static void deleteAnyNode (int position) {
        
        if (head==null) {
            System.out.println("\nLinked List is Empty, There's no Node to Delete");
       
        }else {
            
            ListNode current = head;
            
            if (position<=0 || position > findLength()) {
                throw new IllegalArgumentException("Invalid Argument For Position: " +position
                +"\n Position should have values from 1 to "+findLength());
            } 
            
            if (current.next==null) 
                head = null;
            else {
                if (position==1) {
                    head = head.next;
                } else {
                    
                    ListNode previous = head;
                    int count = 1;
                    while (count < position) {
                        previous = current;
                        current = current.next;
                        count++;
                    }

                    previous.next = current.next;
                }
                
                current.next = null;
            }  
               
            System.out.println("\nDeleted Node at Postion: " +position+ " with data: "+current.data);
            display();
        }            
    }
    
    public static void main(String[] args) {
        System.out.println("Creating a Linked List via a forLoop with data from 1 - 6");
       
        for (int i = 6; i>0; i--) {
            System.out.println("\nAdding a New Head Node with data " +i);
            newHead(i);
            display(); 
        }
        
        deleteAnyNode(6);
        deleteAnyNode(4);
        deleteAnyNode(1);
        deleteAnyNode(3);
        deleteAnyNode(2);
        deleteAnyNode(1);
        deleteAnyNode(5);
        
    }
    
}
