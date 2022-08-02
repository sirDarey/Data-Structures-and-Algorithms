package queqe;

/**
 *
 * @Sir Darey
 */
public class a1_Enqueqe {
    private ListNode front;
    private ListNode rear;
    private int length;
    
    private static class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
            next = null;
        }
    }
    
    public a1_Enqueqe () {
        front = null;
        rear = null;
        length = 0;
    }
    
    boolean isEmpty() {
        return length==0;
    }
    
    void enqueue (int data) { 
        ListNode temp = new ListNode(data);
        
        if (isEmpty()) 
            front = temp;
        else 
            rear.next = temp;
        
        rear = temp;
        length++;
        System.out.println("New Data: " +data+ " has been Offered to the Queue");
        display();
    }
    
    void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        
        ListNode current = front;
        
        while (current!=null) {
            System.out.print(current.data +" --> ");
            current = current.next;
        }
        System.out.println("null");
    }
    
    public static void main(String[] args) {
        a1_Enqueqe queue = new a1_Enqueqe();
        
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
    }
}
