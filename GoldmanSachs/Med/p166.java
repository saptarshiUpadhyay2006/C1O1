//Minm increment to make array unique(Lc 945)
//sort and check

package GoldmanSachs.Med;
import java.util.*;
class p166{
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length,s=0;
        for(int i=1;i<n;i++)
        {
            if(nums[i]<=nums[i-1])
            {
                s+=nums[i-1]-nums[i]+1;
                nums[i]=nums[i-1]+1;
            }
        }
        return s;
    }
}