package sortingAlgorithms;

/**
 * @Sir Darey
 * 
 */
public class b1_SortedSquares {
    
    int [] sortedSquares (int [] array) {
       int n = array.length;
       int [] result = new int[n];
       
       int i=0, j = n-1;
       
        for (int k = n-1; k>=0; k--) {
           if (Math.abs(array[i]) > Math.abs(array[j])) {
               result [k] = array[i] * array[i];
               i++;
           } else {
               result [k] = array[j] * array[j];
               j--;
           }
        }
        return result;
    }
    
    void display (int [] array) {
        for (int i : array) {
            System.out.print(i +" ");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        b1_SortedSquares sort = new b1_SortedSquares();
        
        int [] array = {-4, -1, 0, 3, 10};
        sort.display(array);
        
        System.out.println("Squaring the Sorted Array and Sorting the Resulting Array...");
        sort.display(sort.sortedSquares(array));
    }
    
}
