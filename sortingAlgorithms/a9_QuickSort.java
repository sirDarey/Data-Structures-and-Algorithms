package sortingAlgorithms;

/**
 * @Sir Darey
 * 
 */
public class a9_QuickSort {
    
    void quickSort (int [] array, int low, int high) {
        if (low < high) {
            int p = partition(array, low, high);
            quickSort(array, low, p-1);
            quickSort(array, p+1, high);
        }
    } 
    
    int partition (int[]array, int low, int high) {
        int pivot = array[high];
        int i = low, j = low;
        
        while (i <= high) {
            if (array[i] <= pivot) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                j++;
            }
            i++;
        }
        
        return j-1;
    }
    
    void swap (int[]array, int i, int b) {
        int temp = array[i];
        array[i] = array [b];
        array[b] = temp;
    }
    
    void display (int [] array) {
        for (int i : array) {
            System.out.print(i +" ");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        a9_QuickSort sort = new a9_QuickSort();
        
        int [] array = {8,3,6,2,10,9,7,1,5,4};
        sort.display(array);
        
        System.out.println("Performing Quick Sort on the Array...");
        sort.quickSort(array, 0, array.length-1);
        sort.display(array);
    }
    
}
