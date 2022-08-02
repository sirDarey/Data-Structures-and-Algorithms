package queqe;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

/**
 *
 * @Sir Darey
 */
public class a3_GenerateBinaries {
    
    String generateBinaries (int n) {
        if (n<1)
            throw new IllegalArgumentException("Invalid Argument: "+n+ " Only Natural Numbers Allowed");
        
        Queue <String> queue = new LinkedList<>();
        String result = null;
        
        queue.offer("1");
        
        for (int i=0; i<n; i++) {
            result = queue.poll();
            
            queue.offer(result+"0");
            queue.offer(result+"1");
        }
        return result;
    }
    
    
    public static void main(String[] args) {
        a3_GenerateBinaries queue = new a3_GenerateBinaries();
        int n = 11;
        System.out.println("The Binary Equivalent of "+n+ " is: " +queue.generateBinaries(n));
    }
    
}
