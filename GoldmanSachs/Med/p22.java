//Two Sum(LC 1)
//Using a O(n^2) approach to check

package GoldmanSachs.Med;

class p22{
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        int res[]=new int[2];
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    res[0]=i;
                    res[1]=j;
                }
            }
        }
        return res;
    }
}