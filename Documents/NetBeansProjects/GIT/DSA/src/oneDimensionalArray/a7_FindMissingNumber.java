package oneDimensionalArray;

/**
 *
 * @Sir Darey
 */

public class a7_FindMissingNumber {
    
    //This Algorithm Finds the Missing Number in an array of n natural numbers;
    
    void findMissingNumber (int[]array) {
        
        int n = array.length+1;
        int sum = n * (n+1)/2;
        
        for  (int num : array) {
            sum = sum - num;
        }
        
        System.out.println("The missing number is " +sum);
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
        
        int [] array = {4,8,5,7,2,6,1};
        
        a7_FindMissingNumber oda = new a7_FindMissingNumber();
        oda.display(array);
        
        oda.findMissingNumber(array);
    }
    
}
