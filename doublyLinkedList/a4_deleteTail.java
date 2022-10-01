package doublyLinkedList;

import java.util.NoSuchElementException;

/**
 *
 * @Sir Darey
 */
public class a4_deleteTail {
    private ListNode head, tail;
    int length;
    
    private static class ListNode {
        int data; 
        ListNode previous, next;
        
        public ListNode (int data) {
            this.data = data;
        }  
    }
    
    public a4_deleteTail () {
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
    
    void deleteTail () {
        if (isEmpty()) {
            System.out.println("Doubly Linked List is Empty");
            throw new NoSuchElementException("Doubly Linked List is Empty");
        }
         
        ListNode temp = tail;
        
        if (head==tail)
            head = null;
        else 
            tail.previous.next = null;        
        
        tail = tail.previous;
        temp.previous = null;
        length--;
        
        System.out.println("\nDeleting Tail with data: "+temp.data);
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
        a4_deleteTail dll = new a4_deleteTail();
        
        dll.insertNewTail(1);
        dll.insertNewTail(4);
        dll.insertNewTail(12);
        dll.insertNewTail(5);
        
        dll.displayForward();
        dll.displayBackward();
        
        dll.deleteTail();
        dll.displayForward();
        dll.displayBackward();
        
        dll.deleteTail();
        dll.displayForward();
        dll.displayBackward();
       
    }
    
}
