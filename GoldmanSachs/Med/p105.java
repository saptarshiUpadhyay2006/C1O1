//Minm size subarray sum(LC 209)
//using variable SW

package GoldmanSachs.Med;

class p105{
    public int minSubArrayLen(int target, int[] nums) {
        int l=0,s=0,mini=Integer.MAX_VALUE,n=nums.length;
        for(int r=0;r<n;r++)
        {
            s+=nums[r];
            while(s>=target)
            {
                mini=Math.min(mini,r-l+1);
                s-=nums[l];
                l++;
            }
        }
        return mini==Integer.MAX_VALUE?0:mini;
    }
}