package doublyLinkedList;

/**
 *
 * @Sir Darey
 */
public class a1_InsertNewHead {
    private ListNode head, tail;
    int length;
    
    private static class ListNode {
        int data; 
        ListNode previous, next;
        
        public ListNode (int data) {
            this.data = data;
        }  
    }
    
    public a1_InsertNewHead () {
        this.head = null;
        this.tail = null;
        length = 0;
    }
    
    public boolean isEmpty () {
        return length==0;
    }
    
    void insertNewHead (int data) {
        ListNode newNode = new ListNode(data);
        
        if (isEmpty())
           tail = newNode;
        else {
            head.previous = newNode;
            newNode.next = head;
        }
        head = newNode;
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
        a1_InsertNewHead newHead = new a1_InsertNewHead();
        
        newHead.insertNewHead(1);
        newHead.insertNewHead(4);
        newHead.insertNewHead(12);
        newHead.insertNewHead(5);
        
        newHead.displayForward();
        newHead.displayBackward();
        
    }
    
}
