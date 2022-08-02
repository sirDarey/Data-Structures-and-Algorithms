package oneDimensionalArray;

/**
 *
 * @Sir Darey
 */

public class a8_PalindromeCheck {
    
    void checkPalindrome (String word) {
        
        char[] array = word.toLowerCase().toCharArray();
        int start = 0, end = word.length()-1;
        
        while (start < end) {
            if (array[start] != array[end]) {
                System.out.println("The String \""+word+"\" is NOT a Palindrome");
                return;
            }
            
            start++;
            end--;
        }
        System.out.println("The String \""+word+"\" IS a Palindrome");
    }
    
    void display(int[]array) {
        if (array.length == 0) {
            System.out.println("Array is Empty");
            return;
        }
        
        for (int i : array){
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }
    
    public static void main(String[] args) {
   
        a8_PalindromeCheck oda = new a8_PalindromeCheck();
        oda.checkPalindrome("Madam");
        oda.checkPalindrome("madam");
        oda.checkPalindrome("church");
       
    }
    
}
