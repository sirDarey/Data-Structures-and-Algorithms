package sortingAlgorithms;

/**
 *
 * @Sir Darey
 */
public class a1_BinarySearch {
    
    int search (int [] array, int key) {
        int n = array.length;
        int low = 0, high = n -1;
        
        while (low <= high) {
            int mid = (low+high)/2;
            
            if (array[mid]==key) return mid;
            
            if(key < array[mid]) 
                high = mid-1;
            else
                low = mid+1;
        }
        
        return -1;
    }
    
    void display (int [] array) {
        for (int i : array) {
            System.out.print(i +" ");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        a1_BinarySearch search = new a1_BinarySearch();
        
        int [] array = {1,2,3,4,5,6,7,8,9,10};
        search.display(array);
        
        int keyIndex = search.search(array, 10);
        if (keyIndex == -1)
            System.out.println("Key NOT Found");
        else
            System.out.println("Key found at index: "+keyIndex);
                
    }
    
}
