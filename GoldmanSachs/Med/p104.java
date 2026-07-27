//Maxm Pdt subarray(LC 152)
//Think about exploiting the max & min Sum

package GoldmanSachs.Med;

class p104{
    public int maxProduct(int[] nums) {
        int maxi=nums[0],mini=nums[0],res=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            int t=maxi;
            maxi=Math.max(Math.max(maxi*nums[i],mini*nums[i]),nums[i]);
            mini=Math.min(Math.min(t*nums[i],mini*nums[i]),nums[i]);
            if(maxi>res)
            res=maxi;
        }
        return res;
    }
}