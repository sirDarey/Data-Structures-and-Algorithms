package sortingAlgorithms;

/**
 * @Sir Darey
 * 
 */
public class a4_InsertionSort {
    
    int [] insertionSort (int [] array) {
        int n = array.length;
        for (int i=1; i<n; i++) {
            int temp = array[i];
            int j = i-1;
            while (j>=0 && array[j] > temp) {
                array[j+1] = array[j];
                j = j-1;
            }
            array[j+1] = temp;
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
        a4_InsertionSort sort = new a4_InsertionSort();
        
        int [] array = {8,3,6,2,10,9,7,1,5,4};
        sort.display(array);
        
        System.out.println("Performing Insertion Sort on the Array...");
        sort.display(sort.insertionSort(array));
    }
    
}
