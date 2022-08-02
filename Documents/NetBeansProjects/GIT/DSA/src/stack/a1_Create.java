package stack;

import java.util.EmptyStackException;

/**
 *
 * @Sir Darey
 */
public class a1_Create {
    
    private ListNode top;
    private int length;
    
    private static class ListNode {
        private ListNode next;
        private int data;
        
        public ListNode(int data) {
            this.data = data;
        }
    }
    
    public a1_Create() {
        top = null;
        length = 0;
    }
    
    public boolean isEmpty() {
        return length==0;
    }
    
    public void push(int data){
        ListNode temp = new ListNode(data);
        temp.next = top;
        top = temp;
        length++;
        System.out.println(temp.data +" has been pushed in ");
    }
    
    public void pop() {
        if (isEmpty())
            throw new EmptyStackException();
        
        ListNode temp = top;
        top = top.next;
        length--;
        System.out.println(temp.data +" has been popped out ");
    }
    
    public int peek() {
        if (isEmpty())
            throw new EmptyStackException();
        
        return top.data;
    }
    
    public static void main(String[] args) {
        a1_Create st = new a1_Create();
        
        st.push(10);
        st.push(14);
        st.push(15);
        
        System.out.println("\nThe peak of stack is " +st.peek());
        
        st.pop();
        System.out.println("\nThe peak of stack is " +st.peek());
        st.pop();
        System.out.println("\nThe peak of stack is " +st.peek());
               
    }
    
}
