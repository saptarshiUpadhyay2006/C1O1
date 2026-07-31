//Move zeroes(LC 283)

package DEShaw.Easy;

class p12{
    public void moveZeroes(int[] nums) {
        int z=-1;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==0)
            {
                z=i;
                break;
            }
        }
        if(z==-1)
        return;
        for(int i=z+1;i<n;i++)
        {
            if(nums[i]!=0)
            {
                int t=nums[i];
                nums[i]=nums[z];
                nums[z]=t;
                z++;
            }
        }
    }
}