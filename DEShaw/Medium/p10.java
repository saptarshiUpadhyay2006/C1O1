//Greatest sum divisible by 3(LC 1262)
//Optimal--------T.C:O(n)------S.C:O(1)
//USING THE LC TEMPLATE

package DEShaw.Medium;
import java.util.*;

class Solution {
    public int maxSumDivThree(int[] nums) {
        int dp[]=new int[3];
        for(int i:nums)
        {
            for(int j:Arrays.copyOf(dp,dp.length))
            dp[(i+j)%3]=Math.max(dp[(i+j)%3],i+j);
        }
        return dp[0];
    }

}