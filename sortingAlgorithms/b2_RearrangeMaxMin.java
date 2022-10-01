package sortingAlgorithms;

/**
 * @Sir Darey
 * 
 */
public class b2_RearrangeMaxMin {
    
    int [] reArrange (int [] array) {
       int n = array.length;
       int [] result = new int[n];
       
       int i=0, j = n-1, check = 1;
       
        for (int count=0; count <n; count++) {
            if (check == 0) {
                result [count] = array[i];
                i++;
                check = 1;
            } else {
                result [count] = array[j];
                j--;
                check = 0;
            }
        }
        return result;
    }
    
    /* 
    There is another method of solving this problem if the solution must occupy
    O(1) Space Complexity. 
    This means that a temporary array MUST NOT be created. We have to work with the given 
    array only, make the necessary changes and return same array.
    
    This is shown below. 
    
    **Credit: DINESH VARYANI******
    
    */
    
    void reArrangeO1Space (int [] array) {
        int minId = 0, maxId = array.length - 1;
        int max = array[maxId] + 1;
        
        for (int i=0; i<array.length; i++) {
            if (i%2 == 0) {
                array[i] = array[i] + (array[maxId] % max) * max;
                maxId--;
            } else {
                array[i] = array[i] + (array[minId] % max) * max;
                minId++;
            }
        }
        
        for (int i=0; i<array.length; i++) {
            array[i] = array[i]/max;
        }
    }
    
    void display (int [] array) {
        for (int i : array) {
            System.out.print(i +" ");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        b2_RearrangeMaxMin sort = new b2_RearrangeMaxMin();
        
        int [] array = {2,3,5,6,8,9};
        sort.display(array);
        
        System.out.println("Rearranging the Array in Max_Min Form...");
        sort.display(sort.reArrange(array));
        
        System.out.println("\nSolution for O(1) Space Complexity"
                + "\nNew Array: ");
        
        b2_RearrangeMaxMin sort2 = new b2_RearrangeMaxMin();
        int [] array2 = {1,2,3,4,5,6,7};
        sort2.display(array2);
        
        System.out.println("Rearranging the Array in Max_Min Form...");
        sort2.reArrangeO1Space(array2);
        sort2.display(array2);
    }
    
}
