//Missing Number(LC 268)
//Brute force Approach---Search & Trace basically----T.C:O(nlogn)------S.C:O(logn)
//USING THE LC TEMPLATE
package Amazon.Easy;
import java.util.*;

class p6{
    public int missingNumber(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=1;i<n;i++)
        {
            if(nums[i]-nums[i-1]!=1)
            return nums[i]-1;
        }
        if(nums[n-1]!=n)
        return n;
        return 0;
    }
}