//Find minm in rotated sorted array(LC 153)
//Optimal---------T.C:O(n)------S.C:O(1)
//USING THE LC TEMPLATE

package Atlassian.Medium;
import java.util.*;

class p11{
    public int findMin(int[] nums) {
        int n=nums.length;
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(nums[i]<mini)
            mini=nums[i];
        }
        return mini;
    }
}
