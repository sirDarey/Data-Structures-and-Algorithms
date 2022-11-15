package dynamicProgramming;

/**
 *
 * @Sir Darey
 **/
public class a5_01KnapSack {
    int knapSack (int [] v, int [] w, int maxW) {
        int n = v.length;
        int [][] dp = new int [n+1][maxW+1];
        
        for (int i=0; i<=n; i++) {
            for (int j=0; j<=maxW; j++) {
                if (i==0 || j==0)
                    dp[i][j] = 0;
                else if (w[i-1] <= j) 
                    dp[i][j] = Math.max(v[i-1] + dp[i-1][j-w[i-1]], dp[i-1][j]);
                else
                    dp[i][j] = dp[i-1][j];
            }
        }
        return dp[n][maxW];
    }
    
    public static void main(String[] args) {
        a5_01KnapSack kc = new a5_01KnapSack();
        int [] values = {60, 200, 250}, 
               weights = {10, 20, 30};
        int maxW = 30;
        
        int maxKnapSack = kc.knapSack(values, weights, maxW);
        System.out.println(maxKnapSack);
    }
}
