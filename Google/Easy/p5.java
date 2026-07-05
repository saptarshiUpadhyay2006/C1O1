//Climbing stairs(LC 369)
//Optimal----DP----T.C:O(n)------S.C:O(n)
//USING THE LC TEMPLATE
package Google.Easy;
import java.util.*;

class p5{
    private int fac(int n,int dp[])
    {
        if(n<=1)
        return 1;
        if(dp[n]!=-1)
        return dp[n];
        return dp[n]=fac(n-1,dp)+fac(n-2,dp);
    }
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return fac(n,dp);
    }
}