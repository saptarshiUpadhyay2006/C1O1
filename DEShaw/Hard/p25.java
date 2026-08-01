//House Robber II(LC 213)
//DP

package DEShaw.Hard;
import java.util.*;
class p25{
    public int fac(int idx,int i,int nums[],int dp[])
    {
        if(i==0 && idx==0)
        return nums[idx];
        if(i==1 && idx==1)
        return nums[idx];

        if(idx<i)
        return 0;

        if(dp[idx]!=-1)
        return dp[idx];

        int p=nums[idx]+fac(idx-2,i,nums,dp);
        int np=fac(idx-1,i,nums,dp);
        return dp[idx]=Math.max(p,np);
    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1)
        return nums[n-1];
        int dp1[]=new int[n];
        int dp2[]=new int[n];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);
        int c1=fac(n-2,0,nums,dp1);
        int c2=fac(n-1,1,nums,dp2);
        return Math.max(c1,c2);
    }
}
