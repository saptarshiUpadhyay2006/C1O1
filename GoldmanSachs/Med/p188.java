//Remove on el to make array strictly increasing(LC 1909)
//loop check

package GoldmanSachs.Med;

class p188{
    public boolean canBeIncreasing(int[] nums) {
        int c=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<=nums[i-1])
            {
                c++;
                if(i>1 && nums[i]<=nums[i-2])
                nums[i]=nums[i-1];
            }
        }
        return c<=1;
    }
}