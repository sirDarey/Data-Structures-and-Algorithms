package stack;

import java.util.Stack;

/**
 *
 * @Sir Darey
 */
public class a2_ReverseString {
    
    String reverseString (String string) {
        Stack <Character> stack = new Stack<>();
        char [] chars = string.toCharArray();
        
        for(char c : chars) {
            stack.push(c);
        }
        
        for (int i=0; i<string.length(); i++) {
            chars[i] = stack.pop();
        }
        
        return new String(chars);
    }
    
    public static void main(String[] args) {
        a2_ReverseString stack = new a2_ReverseString();
        
        String string = "ABCD";
        System.out.println("Initial String Before Reverse: " +string);
        
        String reversedString = stack.reverseString(string);
        System.out.println("\nFinal String After Reverse: " +reversedString);
    }
    
}
