//find kth smallest pair distance(LC 719)
//Optimal Approach----T.C:O(nlogn)------S.C:O(1)
//USING THE LC TEMPLATE

package Amazon.Hard;
import java.util.*;
class p1{
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int n=nums.length;
        int l=0,r=nums[n-1]-nums[0];
        while(l<r)
        {
            int m=l+(r-l)/2;
            int c=0;
            for(int i=0,j=0;i<n;i++)
            {
                while(j<n && nums[j]-nums[i]<=m)
                j++;
                c+=j-i-1;
            }
            if(c<k)
            l=m+1;
            else
            r=m;
        }
        return l;
    }
}