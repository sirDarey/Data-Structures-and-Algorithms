package singlyLinkedList;
/**
 *
 * @author Sir Darey
 */
public class a5_InsertAnyPosition {
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
    
    static int findLength () {
        int count = 0;
        
        ListNode current = head;
        while (current!=null){
            current = current.next;
            count++;
        }
        return count;
    }
    
    static void newAnyPosition (int position, int data) {
        if (position<=0 || position > findLength()+1) {
            throw new IllegalArgumentException("Invalid Argument For Position: " +position
            +"\n Position should have values from 1 to "+(findLength()+1));
        }else {
            
            ListNode newNode = new ListNode(data);
            
            if (position==1) {
                newNode.next = head;
                head = newNode;
            }else{
                int count = 1;
                ListNode current = head;
                
                while (count < position - 1) {
                    current = current.next;
                    count++;
                }
                
                newNode.next = current.next;
                current.next = newNode;
            }
            
            System.out.println("\nInserting newNode with data '"+data+"' at Postion '"+position);
            display();
        }
    }
    
    public static void main(String[] args) {
     
       System.out.println("Inserting Nodes at any postion to the Linked List");
         
       newAnyPosition(1, 2);
       newAnyPosition(1, 1);
       newAnyPosition(3, 3);
       newAnyPosition(4, 5);
       newAnyPosition(4, 4); 
       newAnyPosition(7, 6); //This will throw an exception as Position:7 is greater than Max:6 in this case
    }
    
}
