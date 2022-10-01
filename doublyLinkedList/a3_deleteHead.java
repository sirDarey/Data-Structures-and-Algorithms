package doublyLinkedList;

import java.util.NoSuchElementException;

/**
 *
 * @Sir Darey
 */
public class a3_deleteHead {
    private ListNode head, tail;
    int length;
    
    private static class ListNode {
        int data; 
        ListNode previous, next;
        
        public ListNode (int data) {
            this.data = data;
        }  
    }
    
    public a3_deleteHead () {
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
    
    void deleteHead () {
        if (isEmpty()) {
            System.out.println("Doubly Linked List is Empty");
            throw new NoSuchElementException("Doubly Linked List is Empty");
        }
         
        ListNode temp = head;
        
        if (head==tail)
            tail = null;
        else 
            head.next.previous = null;        
        
        head = head.next;
        temp.next = null;
        length--;
        
        System.out.println("\nDeleting Head with data: "+temp.data);
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
        a3_deleteHead dll = new a3_deleteHead();
        
        dll.insertNewTail(1);
        dll.insertNewTail(4);
        dll.insertNewTail(12);
        dll.insertNewTail(5);
        
        dll.displayForward();
        dll.displayBackward();
        
        dll.deleteHead();
        dll.displayForward();
        dll.displayBackward();
        
        dll.deleteHead();
        dll.displayForward();
        dll.displayBackward();
       
    }
    
}
