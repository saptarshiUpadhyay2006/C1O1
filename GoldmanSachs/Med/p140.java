//Max consecutive ones III;
//Pointer approach

package GoldmanSachs.Med;

class p140{
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int l=0,r=0;
        int z=0,m=0;
        while(r<n){
            if(nums[r]==0)
            z++;
            if(z>k)
            {
                if(nums[l]==0)
                {
                    z--;
                }
                l++;
            }
            if(z<=k)
            {
                int len=r-l+1;
                m=Math.max(len,m);
            }
            r++;
            
        }
        return m;
    }
}