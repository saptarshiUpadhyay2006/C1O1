//Find Minimum Cost to Remove Array Elements(LC 3469)
//Optimal--------T.C:O(n)------S.C:O(1)
//USING THE LC TEMPLATE

package DEShaw.Medium;
import java.util.*;
class p4{
    int dp[][];
    public int minCost(int[] nums) {
        dp=new int[1001][1001];
        Arrays.stream(dp).forEach(row -> Arrays.fill(row, -1));
        return fac(nums,1,0);
    }

    private int fac(int nums[],int i,int l)
    {
        if(i+1>=nums.length)
        return Math.max(nums[l],(i<nums.length?nums[i]:0));
        if(dp[i][l]!=-1)
        return dp[i][l];
        int mini=Math.max(nums[i],nums[i+1])+fac(nums,i+2,l);
        mini=Math.min(mini,Math.max(nums[i],nums[l])+fac(nums,i+2,i+1));
        mini=Math.min(mini,Math.max(nums[i+1],nums[l])+fac(nums,i+2,i));
        return dp[i][l]=mini;
    }
}