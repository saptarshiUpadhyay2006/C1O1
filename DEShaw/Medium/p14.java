//Minm size subarray in infinite array(LC 2875)
//Optimal--------T.C:O(nlogM)------S.C:O(1)
//USING THE LC TEMPLATE

package DEShaw.Medium;
import java.util.*;
class p14{
    public int minSizeSubarray(int[] nums, int target) {
        long t=Arrays.stream(nums).sum(),s=0;
        int n=nums.length,p=n,c=n*(int)(target/t),st=0;
        target%=t;
        for(int e=0;e<2*n;e++)
        {
            s+=nums[e%n];
            while(s>target)
            {
                s-=nums[st++%n];
            }
            if(s==target)
            p=Math.min(p,e-st+1);
        }
        return p!=n?p+c:-1;
    }
}