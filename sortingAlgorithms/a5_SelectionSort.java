package sortingAlgorithms;

/**
 *
 * @Sir Darey
 */
public class a5_SelectionSort {
    
    int [] selectionSort (int[]array) {
        for (int i=0; i<array.length-1; i++) {
            int minIndex = i;
            
            for (int j=i+1; j<array.length; j++) {
                if (array[j] <  array[minIndex])
                    minIndex = j;
            }
            int temp = array [minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
       
        return array;
    }
    
    void display (int [] array) {
        for (int i : array) {
            System.out.print(i +" ");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        a5_SelectionSort sort = new a5_SelectionSort();
        
        int [] array = {8,3,6,2,10,9,7,1,5,4};
        sort.display(array);
        
        System.out.println("Performing Selection Sort on the Array...");
        sort.display(sort.selectionSort(array));
    }
}
