//LIS(LC 300)
//dp

package GoldmanSachs.Med;
import java.util.*;
class p174{
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];
        Arrays.fill(dp,1);
        for(int i=0;i<n;i++)
        {
            for(int j=i-1;j>=0;j--)
            {
                if(nums[j]<nums[i])
                dp[i]=Math.max(dp[i],dp[j]+1);
            }
        }
        int res=0;
        for(int i=0;i<n;i++)
        {
            res=Math.max(res,dp[i]);
        }
        return res;
    }
}