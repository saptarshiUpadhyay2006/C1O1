//FInd Pivot Index(LC 724)

package GoldmanSachs.Med;

class p209{
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int s=0;
        for(int i=0;i<n;i++)
        {
            s+=nums[i];
        }
        int ls=0,rs=0;
        int idx=-1;
        for(int j=0;j<n-1;j++)
        {
            rs=s-nums[j]-ls;
            if(ls==rs)
            {
                idx=j;
                return idx;
            }
            ls+=nums[j];
        }
        rs=0;
        if(ls==rs)
        idx=n-1;
        return idx;
    }
}