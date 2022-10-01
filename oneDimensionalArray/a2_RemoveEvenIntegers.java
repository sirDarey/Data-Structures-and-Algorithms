package oneDimensionalArray;

/**
 *
 * @Sir Darey
 */

public class a2_RemoveEvenIntegers {
    
    int[] removeEvenIntegers (int[]array) {
        int oddCount = 0;
        for (int i=0; i<array.length; i++) {
            if (array[i]%2 != 0)
                oddCount++;
        }
        
        int[] newOddArray = new int[oddCount];
        int index = 0;
        
        for (int i=0; i<array.length; i++){            
            if (array[i]%2 != 0){
                newOddArray[index] = array[i];
                index++;
            }
        }
        
        System.out.println("Removing Even Integers...");
        return newOddArray;
    }
    
    void display(int[]array) {
        if (array.length == 0) {
            System.out.println("Array is Empty");
            return;
        }
        
        for (int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("\n");
    }
    
    public static void main(String[] args) {
        
        int [] array = {1,2,3,4,5,6,7,8,9};
        
        a2_RemoveEvenIntegers oda = new a2_RemoveEvenIntegers();
        oda.display(array);
        
        int [] newOddArray = oda.removeEvenIntegers(array);
        oda.display(newOddArray);       
    }
}
