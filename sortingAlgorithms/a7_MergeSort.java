package sortingAlgorithms;

/**
 * @Sir Darey
 * 
 */
public class a7_MergeSort {
    
    void divide (int [] array, int []temp, int low, int high) {
        
        if (low < high) {
            int mid = low + (high - low)/2;
            divide(array, temp, low, mid);
            divide(array, temp, mid+1, high);
            mergeSort (array, temp, mid, low, high);
        }
    }
    
    void mergeSort(int[]array, int []temp, int mid, int low, int high) {
        for (int i=low; i<=high; i++){
            temp[i] = array[i];
        }
        
        int i = low, j = mid+1, k = low;
        while(i <= mid && j <= high) {
            if (temp[i] <= temp[j]){
                array[k] = temp[i];
                i++;
            } else {
                array[k] = temp[j];
                j++;
            }
            k++;
        }
        
        while (i <= mid) {
            array[k] = temp[i];
            i++;
            k++;
        }
    }
    
    void display (int [] array) {
        for (int i : array) {
            System.out.print(i +" ");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        a7_MergeSort sort = new a7_MergeSort();
        
        int [] array = {8,3,6,2,10,9,7,1,5,4};
        int []temp = new int [array.length];
        sort.display(array);
        
        System.out.println("Performing Merge Sort on the Array...");
        sort.divide(array, temp, 0, array.length-1);
        sort.display(array);
    }
    
}
