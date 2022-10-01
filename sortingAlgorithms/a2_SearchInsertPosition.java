package sortingAlgorithms;

/**
 * @Sir Darey
 * 
 * This Algorithm performs a Binary Search on an Array and returns the right position of the search key; 
 * If Search key is not found, it returns the right position it ought to be if it were present.
 */
public class a2_SearchInsertPosition {
    
    void search (int [] array, int key) {
        int n = array.length;
        int low = 0, high = n-1;
        
        while (low <= high) {
            int mid = low + (high - low)/2;
            
            if (array[mid]==key){
                System.out.println("Key found at index: "+mid);
                return;
            }
            
            if (array[mid] < key) 
                low = mid+1;
            else
                high = mid-1;
        }
        
        System.out.println("Key NOT Found!!!\nHowever, it would have been at index: "
                    +low+ " if it were to be present");
       
    }
    
    void display (int [] array) {
        for (int i : array) {
            System.out.print(i +" ");
        }
        System.out.println("");
    }
    
    public static void main(String[] args) {
        a2_SearchInsertPosition search = new a2_SearchInsertPosition();
        
        int [] array = {1,2,3,4,6,7,9,10};
        search.display(array);
        
        int searchKey = 5;
        
        System.out.println("Search Key: "+searchKey);
        search.search(array, searchKey);
    }
    
}
