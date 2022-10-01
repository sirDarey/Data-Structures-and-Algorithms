package doublyLinkedList;

/**
 *
 * @Sir Darey
 */
public class a2_insertNewTail {
    private ListNode head, tail;
    int length;
    
    private static class ListNode {
        int data; 
        ListNode previous, next;
        
        public ListNode (int data) {
            this.data = data;
        }  
    }
    
    public a2_insertNewTail () {
        this.head = null;
        this.tail = null;
        length = 0;
    }
    
    public boolean isEmpty () {
        return length==0;
    }
    
    void insertNewTail (int data) {
        ListNode newNode = new ListNode(data);
        
        if (isEmpty())
           head = newNode;
        else {
            tail.next = newNode;
            newNode.previous = tail;
        }
        tail = newNode;
        length++;
    }
    
    void displayForward () {
        if (head == null){
            System.out.println("Doubly Linked List is Empty");
            return;
        }
        
        ListNode  current = head;

        while(current!=null) {
            System.out.print(current.data +" --> ");
            current = current.next;
        }
        System.out.println("null");
    }
    
    void displayBackward () {
        if (tail == null){
            System.out.println("Doubly Linked List is Empty");
            return;
        }
        
        ListNode current = tail;

        while(current!=null) {
            System.out.print(current.data +" --> ");
            current = current.previous;
        }
        System.out.println("null");
    }
    
    public static void main(String[] args) {
        a2_insertNewTail newTail = new a2_insertNewTail();
        
        newTail.insertNewTail(1);
        newTail.insertNewTail(4);
        newTail.insertNewTail(12);
        newTail.insertNewTail(5);
        
        newTail.displayForward();
        newTail.displayBackward();
        
    }
    
}
