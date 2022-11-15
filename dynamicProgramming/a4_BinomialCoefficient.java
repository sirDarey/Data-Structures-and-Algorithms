package dynamicProgramming;

/**
 *
 * @Sir Darey
 **/
public class a4_BinomialCoefficient {
    //This algorithm gives the coefficient of nCr -> n combination r
    
    int calc (int n, int r) {
        int [] dp = new int[r+1];
        dp[0] = 1;
        
        for (int i=1; i<=n; i++){
            for (int j=Math.min(i, r); j>0; j--){
                dp[j] = dp[j] + dp[j-1];
            }
        }        
        return dp[r];
    }
    
    public static void main(String[] args) {
        a4_BinomialCoefficient bc = new a4_BinomialCoefficient();
        int coefficient = bc.calc(6, 4);
        
        System.out.println(coefficient);
    }
}
