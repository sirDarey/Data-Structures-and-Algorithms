package dynamicProgramming;

/**
 *
 * @Sir Darey
 */
public class a2_FibonacciTopDown {
    public int getFib (int[]memo, int n) {
        if (memo[n]==0) {
            if (n<2) {
                memo[n] = n;
            } else {
                int left = getFib(memo, n-1);
                int right = getFib(memo, n-2);
                memo[n] = left + right;
            }
        }
        
        return memo[n];
    }
    
    public static void main(String[] args) {
        a2_FibonacciTopDown fib = new a2_FibonacciTopDown();
        int fibIndex = 7;
        int [] memoTable = new int[fibIndex+1];
        System.out.println(fib.getFib(memoTable, fibIndex));
    }
}
