package dynamicProgramming;

import java.util.Arrays;

/**
 *
 * @Sir Darey
 */
public class a2_FibonacciTopDown {
    int [] memo;
    
    public int getFib (int n) {
        if (memo[n]==-1) {
            int left = getFib(n-1);
            int right = getFib(n-2);
            memo[n] = left + right;
        }
        return memo[n];
    }
    
    public static void main(String[] args) {
        a2_FibonacciTopDown fib = new a2_FibonacciTopDown();
        int n = 40;
        
        if (n < 2) {
            System.out.println(n);
            return;
        }
        
        fib.memo = new int[n+1];
        Arrays.fill(fib.memo, -1);
        
        fib.memo[0] = 0;
        fib.memo[1] = 1;
        
        System.out.println(fib.getFib(n));
    }
}
