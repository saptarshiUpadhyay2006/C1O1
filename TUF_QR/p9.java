package TUF_QR;

class p9{
    public int minimumRateToEatBananas(int[] nums, int h) {
        int maxi=max(nums);
        for(int i=1;i<=maxi;i++)
        {
            long r=cal(nums,i);
            if(r<=(long)h)
            return i;
        }
        return maxi;
    }

    private long cal(int nums[],int h)
    {
        long t=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        t+=Math.ceil((double)nums[i]/(double)h);

        return t;
    }

    private int max(int nums[])
    {
        int n=nums.length;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            maxi=Math.max(maxi,nums[i]);
        }
        return maxi;
    }
}
