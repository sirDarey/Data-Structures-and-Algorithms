package sortingAlgorithms;

/**
 * @Sir Darey
 * 
 */
public class a3_BubbleSort {
    
    int [] bubbleSort (int [] array) {
        int n = array.length;
        int check = 1;
        while (check == 1) {
            
            check = 0;
            
            for (int i=0; i<n-1; i++) {
                if (array[i] > array[i+1]) {
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    check = 1;
                }                
            }
            n--;
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
        a3_BubbleSort sort = new a3_BubbleSort();
        
        int [] array = {8,3,6,2,10,9,7,1,5,4};
        sort.display(array);
        
        System.out.println("Performing Bubble Sort on the Array...");
        sort.display(sort.bubbleSort(array));
    }
    
}
