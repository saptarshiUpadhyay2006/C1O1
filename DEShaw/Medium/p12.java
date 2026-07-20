//Maximize score of no.s in range(LC 3281)
//Optimal--------T.C:O(nlogM)------S.C:O(1)
//USING THE LC TEMPLATE

package DEShaw.Medium;
import java.util.*;
class p12{
    public int maxPossibleScore(int[] start, int d) {
        int l=0,h=Integer.MAX_VALUE,res=-1;
        Arrays.sort(start);
        while(l<=h)
        {
            int m=l+(h-l)/2;
            if(fac(start,d,m))
            {
                res=m;
                l=m+1;
            }
            else
            h=m-1;
        }
        return res;
    }
    private boolean fac(int nums[],int d,int m)
    {
        int n=nums.length,p=nums[0];
        for(int i=1;i<n;i++)
        {
            if(p+m>nums[i]+d)
            return false;
            p=Math.max(nums[i],p+m);
        }
        return true;
    }
}