package circularSinglyLinkedList;

import java.util.NoSuchElementException;

/**
 * @Sir Darey
 */

public class a4_deleteFirstNode {
    
    private ListNode last;
    private int length;
    
    private static class ListNode {
        private ListNode next;
        private int data;
        
        public ListNode (int data) {
            this.data = data;
        }
    }
    
    public a4_deleteFirstNode () {
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
    
    void deleteFirstNode() {
        if (isEmpty()) {
            throw new NoSuchElementException("The Circular Linked List is Empty");
        }
        
        ListNode first = last.next;
        if (last==last.next) {
            last = null;
        } else {  
            last.next = first.next;
            first.next = null;
        }
        
        length--;        
        System.out.println("Deleted First Node with Data: "+first.data);
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
        a4_deleteFirstNode csll = new a4_deleteFirstNode();
        
        csll.insertNewLastNode(4);
        csll.insertNewLastNode(8);
        csll.insertNewLastNode(1);
        csll.insertNewLastNode(23);
        
        csll.display();
        
        csll.deleteFirstNode();
        csll.display();
        
        csll.deleteFirstNode();
        csll.display();
        
        csll.deleteFirstNode();
        csll.display();
        
        csll.deleteFirstNode();
        csll.display();
    }
    
}
