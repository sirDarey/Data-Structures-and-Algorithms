package oneDimensionalArray;

/**
 *
 * @Sir Darey
 */

public class a5_MoveZerosToTheEnd {
    
    void moveZeros (int[]array) {
        if(array.length==0)
            throw new IllegalArgumentException("Invalid Array Argument");
        
        int zeroPosition = 0, temp;       
        
        for (int i=0; i<array.length; i++) {
            if (array[zeroPosition] == 0 && array[i]!=0){
                temp = array[i];
                array[i] = 0;
                array[zeroPosition] = temp;
            } 
            
            if (array[zeroPosition]!=0)
                zeroPosition++;
        }
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
        
        int [] array = {3,4,0,6,0,2,6,0,9};
        
        a5_MoveZerosToTheEnd oda = new a5_MoveZerosToTheEnd();
        oda.display(array);
        
        
        System.out.println("Moving the Zeros to the End...");
        oda.moveZeros(array);
        oda.display(array);
    }
    
}
