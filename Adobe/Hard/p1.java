//Reducing dishes(LC 1402)
//Optimal----Use DP-----T.C:O(n^2)------S.C:O(n^2)
//USING THE LC TEMPLATE

package Adobe.Hard;
import java.util.*;
class p1{
    int dp[][];
    public int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);
        int n=satisfaction.length;
        dp=new int[n+1][501];
        for(int i=0;i<=n;i++)
        Arrays.fill(dp[i],-1);

        return fac(satisfaction,0,1);
    }

    private int fac(int nums[],int i,int t)
    {
        if(i==nums.length)
        return 0;

        if(dp[i][t]!=-1)
        return dp[i][t];
        int tk=nums[i]*t+fac(nums,i+1,t+1);
        int ntk=fac(nums,i+1,t);

        return dp[i][t]=Math.max(tk,ntk);
    }
}