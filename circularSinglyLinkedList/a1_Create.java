package circularSinglyLinkedList;

/**
 * @Sir Darey
 */
public class a1_Create {
    
    private ListNode last;
    
    private static class ListNode {
        private ListNode next;
        private int data;
        
        public ListNode (int data) {
            this.data = data;
        }
    }
    
    public a1_Create () {
        last = null;
    }
   
    void create () {
        ListNode first = new ListNode(2);
        ListNode second = new ListNode(5);
        ListNode third = new ListNode(1);
        ListNode fourth = new ListNode(7);
        
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;
        
        last = fourth;
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
        a1_Create csll = new a1_Create();
        csll.create();
        csll.display();
    }
    
}
