//This Algorithm is used to determine the Maximum subArray Sum in an Array
package dynamicProgramming;

/**
 *
 * @Sir Darey
 */
public class a3_KadaneAlgorithm {
    
    int calcMaxSum (int [] array) {
        if (array == null) 
            throw new IllegalArgumentException ("Invalid Array Input Argument");
        
        int startIndex = 0;
        int currentMax = array[0];
        int maxSoFar = array[0];
        
        for (int i=1; i<array.length; i++) {
            
            currentMax = currentMax+array[i];
            if (currentMax < array[i]) {
                currentMax = array[i];
                startIndex = i;                
            }
            
            if (maxSoFar < currentMax) {
                maxSoFar = currentMax;
            }
        }
        getSubArray(array, startIndex);
        return maxSoFar;        
    }
    
    void getSubArray (int []array, int startIndex) {
        int subArraySize = array.length - startIndex;
        
        int [] subArray = new int[subArraySize];
        
        for (int i=0; i<subArraySize; i++) {
            subArray[i] = array[startIndex];
            startIndex++;
        }
        
        System.out.println("The SubArray that gives MAX Sum is: ");
        for (int i : subArray){
            System.out.print(i+" ");
        }
        System.out.println("\n");
    }
    
    public static void main(String[] args) {
        a3_KadaneAlgorithm ka = new a3_KadaneAlgorithm();
        int [] array = {4, 3, -2, 6, -12, 7, -1, 6};
        
        System.out.println("The Sum of the Array is: "
        +ka.calcMaxSum(array));
        
    }
}
