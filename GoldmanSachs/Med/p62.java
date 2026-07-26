//No of perfect pairs(LC 3649)
//Two pointer approach

package GoldmanSachs.Med;
import java.util.*;
class p62{
    public long perfectPairs(int[] nums) {
        int n=nums.length,r=0;
        long arr[]=new long[n];
        for(int i=0;i<n;i++)
        arr[i]=Math.abs((long)nums[i]);

        Arrays.sort(arr);

        long c=0;
        for(int i=0;i<n;i++)
        {
            if(r<i)
            r=i;
            while(r+1<n && arr[r+1]<=2*arr[i])
            r++;

            c+=(r-i);
        }
        return c;
    }
}