//Greatest sum divisible by three(LC 1262)
//dp works

package GoldmanSachs.Med;
import java.util.*;
class p158{
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