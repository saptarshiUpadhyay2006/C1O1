//Find All good indices(LC 2420)
//use prefix sum

package GoldmanSachs.Med;
import java.util.*;
class p42{
    public List<Integer> goodIndices(int[] nums, int k) {
        List<Integer> arr=new ArrayList<>();
        int n=nums.length;
        int l[]=new int[n];
        int r[]=new int[n];
        for(int i=1;i<n;i++)
        {
            if(nums[i]<=nums[i-1])
            l[i]=l[i-1]+1;
        }
        for(int i=n-2;i>=0;i--)
        {
            if(nums[i+1]>=nums[i])
            r[i]=r[i+1]+1;
        }
        for(int i=k;i<n-k;i++)
        {
            if(l[i-1]>=k-1 && r[i+1]>=k-1)
            arr.add(i);
        }
        return arr;
    }
}