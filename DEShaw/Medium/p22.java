//House Robber(LC 198)

package DEShaw.Medium;
import java.util.*;
class p22{
    public int rob(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return fac(nums,dp,n-1);
    }
    private int fac(int nums[],int dp[],int n)
    {
        if(n<0)
        return 0;
        if(dp[n]!=-1)
        return dp[n];
        dp[n]=Math.max(fac(nums,dp,n-1),nums[n]+fac(nums,dp,n-2));
        return dp[n];
    }

}