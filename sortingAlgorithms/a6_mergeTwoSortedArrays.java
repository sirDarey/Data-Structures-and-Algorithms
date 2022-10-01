package sortingAlgorithms;

/**
 *
 * @Sir Darey
 */
public class a6_mergeTwoSortedArrays {
    
    int [] mergeTwoArrays (int[] a1, int[]a2) {
        int x = a1.length, y = a2.length;
        int [] result = new int [x+y];
        
        int i = 0, j = 0, k = 0;
        
        while (i<x && j<y) {
            if (a1[i] < a2[j]) {
                result[k] = a1[i];
                i++;
            } else {
                result[k] = a2[j];
                j++;
            }
            
            k++;
        }
        
        while (i<x) {
            result[k] = a1[i];
            i++; k++;
        }
        
        while (j<y) {
            result[k] = a2[j];
            j++; k++;
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
        
        int [] array1 = {2,4,7,10};
        int [] array2 = {3,5,8};
        
        a6_mergeTwoSortedArrays sort = new a6_mergeTwoSortedArrays();
        
        System.out.print("Array 1: ");
        sort.display(array1);
        
        System.out.print("Array 2: ");
        sort.display(array2);
        
        System.out.println("\nMerging the two Sorted Arrays...");
        sort.display(sort.mergeTwoArrays(array1, array2));
    }
}
