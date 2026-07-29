//Perfect Squares(LC 279)
//DP

package GoldmanSachs.Med;
import java.util.*;
class p215{
    public int numSquares(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        int c=1;
        while(c*c<=n)
        {
            int sq=c*c;
            for(int i=sq;i<=n;i++)
            dp[i]=Math.min(dp[i-sq]+1,dp[i]);
            c++;
        }
        return dp[n];
    }
}