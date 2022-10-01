package sortingAlgorithms;

/**
 * @Sir Darey
 * 
 */
public class a8_DutchFlag {
    
    void sort (int [] array) {
        int i = 0, j = 0, k = array.length-1;
        
        while(i <= k) {
            if (array[i]==0){
                swap (array, i, j);
                j++;
                i++;        
            } else if (array[i]==1)
                i++;
            else{
                swap(array, i, k);
                k--;
            }
        }
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
        a8_DutchFlag sort = new a8_DutchFlag();
        
        int [] array = {2,2,1,0,2,1,0,2,1};
        sort.display(array);
        
        System.out.println("Sorting the Array to 0's, 1's and 2's...");
        sort.sort(array);
        sort.display(array);
    }
    
}
