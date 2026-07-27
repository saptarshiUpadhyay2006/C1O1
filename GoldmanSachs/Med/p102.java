//Climbing stairs(LC 70)
//dp framework

package GoldmanSachs.Med;
import java.util.*;
class p102{
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return rec(dp,n);
    }
    private int rec(int dp[],int n)
    {
        if(n<=1)
        return 1;
        if(dp[n]!=-1)
        return dp[n];
        dp[n]=rec(dp,n-1)+rec(dp,n-2);
        return dp[n];
    }
}