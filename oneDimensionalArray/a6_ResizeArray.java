package oneDimensionalArray;

/**
 *
 * @Sir Darey
 */

public class a6_ResizeArray {
    
    int[] resizeArray (int[]array,int newSize) {
        
        if (newSize < array.length)
            throw new IndexOutOfBoundsException("You can't resize an array to a smaller length");
        
        int [] temp = new int[newSize];
        System.arraycopy(array, 0, temp, 0, array.length); //This line can replace the commented codes below
        
        /*
        for (int i=0; i<array.length; i++) {
            temp[i]  = array[i];
        }*/
        
        return temp;
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
        
        int [] array = {4,8,5,0,2,6,1};
        
        a6_ResizeArray oda = new a6_ResizeArray();
        oda.display(array);
        
        System.out.println("Resizing the Array");
        array = oda.resizeArray(array, 10);
        oda.display(array);
    }
    
}
