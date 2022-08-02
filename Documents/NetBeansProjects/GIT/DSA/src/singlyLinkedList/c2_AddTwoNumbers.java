package singlyLinkedList;
                        
public class c2_AddTwoNumbers {
    
    private ListNode head;
    
    private static class ListNode  {
        private final int data;
        private ListNode  next;
        
        public ListNode (int data) {
            this.data = data;
            next = null;
        }
    }
    
    void display () {
        ListNode current = head;
        
        while (current!=null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        
        System.out.println("null");
    }
   
    void newLast (int data) {
        ListNode newNode = new ListNode(data);
        
        if (head==null){
            head = newNode;
            return;
        }
        
        ListNode current = head;
        while (current.next!=null) {
            current = current.next;
        }
        current.next = newNode;
    }
    
    static ListNode addNumbers (ListNode head1, ListNode head2) {
        if(head1==null && head2==null) {
            System.out.println("\nBoth Lists are Empty");
            return null;
        }
        
        ListNode headDummy = new ListNode(0); //can take any value as argument
        ListNode temp = headDummy;
        int carry = 0;
        
        while (head1!=null || head2!=null) {
            int x = (head1==null)? 0 : head1.data;
            int y = (head2==null)? 0 : head2.data;
            
            int sum = x+y+carry;
            
            temp.next = new ListNode(sum%10);
            carry = sum/10;
            temp = temp.next;
            
            if(head1!=null) 
                head1 = head1.next;
            if(head2!=null) 
                head2 = head2.next;
        }
        
        if (carry>0) 
            temp.next = new ListNode(carry);
        
        return headDummy.next;
    }
   
    
    public static void main(String[] args) {
        
       //Creating Linked List that holds the First Number --> 753
       c2_AddTwoNumbers num1 = new c2_AddTwoNumbers();
       num1.newLast(7);
       num1.newLast(5);
       num1.newLast(3);
       
       //Creating Linked List that holds the Second Number --> 27
       c2_AddTwoNumbers num2 = new c2_AddTwoNumbers();
       num2.newLast(2);
       num2.newLast(7);
       
       //Both Numbers are arranged in the reverse order
       //Thus, the addition is same as: 357 + 72 = 429 (In this case)
       //Therefore, we should get 924 as our result (Since it is reversed)
       
       num1.display();
       num2.display();
       
       c2_AddTwoNumbers result = new c2_AddTwoNumbers();
       
       if (addNumbers(num1.head, num2.head)!=null) {
           System.out.println("Adding The Two Numbers....\n");
           result.head = addNumbers(num1.head, num2.head);
           result.display(); 
       }
                  
    }
    
}
