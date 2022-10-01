package stack;

import java.util.Stack;

/**
 *
 * @Sir Darey
 */
public class a4_ValidParenthesis {
    
    boolean isValid (String string) {
        if (string.length()==0 ||  string==null) 
            throw new IllegalArgumentException("String is Empty");
        if (string.length()%2 != 0)
            return false;
        
        Stack <Character> stack = new Stack<>();
        
        for (char c : string.toCharArray()) {
            if (c=='[' || c=='{' || c=='(')
                stack.push(c);
            
            else if (!stack.isEmpty()) {
                if ((stack.peek()=='[' &&  c==']') ||
                    (stack.peek()=='{' &&  c=='}') ||
                    (stack.peek()=='(' &&  c==')') ) 
                    
                    stack.pop(); 
                else
                    return false;
            } else 
                return false;
        }
        return true;         
    }
    
    public static void main(String[] args) {
        a4_ValidParenthesis stack = new a4_ValidParenthesis();
        
        String string = "{([])}";
        
        System.out.println("String: "+string);
        if (stack.isValid(string))
            System.out.println("The String is a Valid Pair of Parenthesis");
        else
            System.out.println("The String is NOT a Valid Pair of Parenthesis");
        
    }
    
}
