package oneDimensionalArray;

/**
 *
 * @Sir Darey
 */

public class a4_FindSecondMaxValue {
    
    void findSecondMaxValue (int[]array) {
        if(array.length==0)
            throw new IllegalArgumentException("Invalid Array Argument");
        
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;        
        
        for (int i=0; i<array.length; i++) {
            if (array[i] > max){
                secondMax = max;
                max = array[i];
            } else if (array[i] > secondMax && array[i]!=max){ 
                secondMax = array[i];
            }
        }
        
        System.out.println("The Second Maximum Value is: " +secondMax);
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
        
        int [] array = {6,2,27,18,1,24,18, 24};
        
        a4_FindSecondMaxValue oda = new a4_FindSecondMaxValue();
        oda.display(array);
        
        oda.findSecondMaxValue(array);
    }
    
}
