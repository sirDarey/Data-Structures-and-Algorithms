package interviewProblems;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @Sir Darey
 */
public class TwoSum {
    
    public int [] solution (int [] array, int target) {
        int [] result = new int [2];
        Map <Integer, Integer> map = new HashMap();
        
        for (int i=0; i<array.length; i++) {
            if (!map.containsKey(target - array[i]))
                map.put(array[i], i);
            else {
                result[0] = map.get(target - array[i]);
                result[1] = i;
                return result;
            }    
        }
       
        throw new IllegalArgumentException("Two Number NOT Found!!!");
    }
    
    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        int [] result = solution.solution(new int[] {6,5,3,7,8,2}, 10);
        
        for  (int i : result) {
            System.out.print(i + " ");
        }
    }
    
}
