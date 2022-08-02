package stack;

import java.util.Stack;

/**
 *
 * @Sir Darey
 */
public class a3_NextGreaterElement {
    
    int [] nextGreaterElement (int[] array) {
        if (array.length==0) 
            throw new IllegalArgumentException("Array is empty");
        
        Stack <Integer> stack = new Stack<>();
        int [] result = new int[array.length];
        
        for (int i=array.length-1; i>=0; i--) {
            if (!stack.isEmpty()){
                while (!stack.isEmpty() && array[i]>stack.peek()) {
                    stack.pop();                    
                }   
            }  
            
            if (stack.isEmpty())
                result [i] = -1;
            else 
                result[i] = stack.peek();
            
            stack.push(array[i]);        
        }
        
        return result;
    }
    
    void display (int [] array) {
        System.out.print("[");
        for (int i : array) {
            System.out.print(" "+i);
        }
        System.out.println(" ]");
    }
    
    public static void main(String[] args) {
        a3_NextGreaterElement stack = new a3_NextGreaterElement();
        
        int [] array = {4, 7, 3, 4, 8, 9};
        
        System.out.print("Initial Array: ");
        stack.display(array);
        
        System.out.print("\nArray of Next Greater Element: ");
        stack.display(stack.nextGreaterElement(array));
    }
    
}
