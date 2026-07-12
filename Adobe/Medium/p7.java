//Minimize maxm pair sum in array(LC 1877)
//Optimal-----Sort and sum from two ends----T.C:O(nlogn)------S.C:O(1)
//USING THE LC TEMPLATE
package Adobe.Medium;
import java.util.*;

class p7{
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int maxi=0;
        for(int i=0;i<n;i++)
        {
            maxi=Math.max(maxi,nums[i]+nums[n-i-1]);
        }
        return maxi;
    }
}