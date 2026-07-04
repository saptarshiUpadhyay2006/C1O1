//Move Zeroes(LC 283)
//Optimal Approach----Two Pointer & Swap approach---T.C:O(n)------S.C:O(1)
//USING THE LC TEMPLATE

package GS.Easy;

class Solution {
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