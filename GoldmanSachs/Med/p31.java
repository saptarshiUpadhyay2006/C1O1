//Maxm subarray(LC 53)
//iterate and check max

package GoldmanSachs.Med;

class p31{
    public int maxSubArray(int[] nums) {
        int maxi=Integer.MIN_VALUE,cs=0,c=0;
        int m=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<0)
            c++;

            m=Math.max(m,nums[i]);
        }
        for(int i=0;i<nums.length;i++)
        {
            cs+=nums[i];
            if(cs<0)
            cs=0;

            if(cs>maxi)
            maxi=cs;
        }

        if(c!=nums.length)
        return maxi;
        else return m;
    }
}