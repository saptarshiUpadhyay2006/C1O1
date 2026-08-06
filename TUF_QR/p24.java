package TUF_QR;

class p24{
    public long subArrayRanges(int[] nums) {
     int n=nums.length;
     long s=0;
     for(int i=0;i<n;i++)
     {
        int sm=nums[i],lg=nums[i];
        for(int j=i;j<n;j++)
        {
            sm=Math.min(sm,nums[j]);
            lg=Math.max(lg,nums[j]);
            s+=(lg-sm);
        }
     }
     return s;
    }
}