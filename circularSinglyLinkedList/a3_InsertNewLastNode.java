package circularSinglyLinkedList;

/**
 * @Sir Darey
 */

public class a3_InsertNewLastNode {
    
    private ListNode last;
    private int length;
    
    private static class ListNode {
        private ListNode next;
        private int data;
        
        public ListNode (int data) {
            this.data = data;
        }
    }
    
    public a3_InsertNewLastNode () {
        last = null;
        length = 0;
    }
    
    public boolean isEmpty () {
        return length==0;
    }
    
    void insertNewLastNode (int data) {
        ListNode newLast = new ListNode(data);
        
        if (isEmpty()) {
            last = newLast;
            last.next = last;
        } else {
            newLast.next = last.next;
            last.next = newLast;
            last = newLast;
        }
        
        length++;
    }
    
    void display () {
        
        if (last==null) {
            System.out.println("The Circular Linked List is Empty");
            return;
        }
        
        ListNode first = last.next;
        
        while(first!=last) {
            System.out.print(first.data +" --> ");
            first = first.next;
        }
        System.out.println(last.data +" <-->");
    }
    
    public static void main(String[] args) {
        a3_InsertNewLastNode csll = new a3_InsertNewLastNode();
        csll.insertNewLastNode(4);
        csll.insertNewLastNode(8);
        csll.insertNewLastNode(1);
        csll.insertNewLastNode(23);
        
        csll.display();
    }
    
}
