//Sum of Subarray ranges(LC 2104)
//Optimal Approach---Pointer Approach----T.C:O(n^2)------S.C:O(1)
//USING THE LC TEMPLATE
package Amazon.Medium;

class Solution {
    public long subArrayRanges(int[] nums) {
        int n=nums.length;
        long s=0;
        for(int i=0;i<n;i++)
        {
            int mini=nums[i];
            int maxi=nums[i];
            for(int j=i;j<n;j++)
            {
                maxi=Math.max(maxi,nums[j]);
                mini=Math.min(mini,nums[j]);
                s+=maxi-mini;
            }
        }
        return s;
    }
}