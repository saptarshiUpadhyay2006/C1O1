package TUF_QR;
import java.util.*;
class p10{
    public int aggressiveCows(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        int l=1,h=nums[n-1]-nums[0];
        while(l<=h)
        {
            int m=(l+h)/2;
            if(can(nums,m,k)==true)
            l=m+1;
            else
            h=m-1;
        }
        return h;
    }
    private boolean can(int nums[],int dist,int c)
    {
        int n=nums.length;
        int cnt=1;
        int l=nums[0];
        for(int i=1;i<n;i++)
        {
            if(nums[i]-l>=dist)
            {
                cnt++;
                l=nums[i];
            }
            if(cnt>=c)
            return true;
        }
        return false;
    }
}

