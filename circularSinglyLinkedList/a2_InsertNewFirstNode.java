package circularSinglyLinkedList;

/**
 * @Sir Darey
 */

public class a2_InsertNewFirstNode {
    
    private ListNode last;
    private int length;
    
    private static class ListNode {
        private ListNode next;
        private int data;
        
        public ListNode (int data) {
            this.data = data;
        }
    }
    
    public a2_InsertNewFirstNode () {
        last = null;
        length = 0;
    }
    
    public boolean isEmpty () {
        return length==0;
    }
    
    void insertNewFirstNode (int data) {
        ListNode newFirst = new ListNode(data);
        
        if (isEmpty())
            last = newFirst;
        
        newFirst.next = last.next;        
        last.next = newFirst;
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
        a2_InsertNewFirstNode csll = new a2_InsertNewFirstNode();
        csll.insertNewFirstNode(4);
        csll.insertNewFirstNode(8);
        csll.insertNewFirstNode(1);
        csll.insertNewFirstNode(23);
        csll.display();
    }
    
}
