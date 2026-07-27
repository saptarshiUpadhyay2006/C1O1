//Identify largest outlier in an Array(LC 3371)
//Using a map

package GoldmanSachs.Med;
import java.util.*;
class p112{
    public int getLargestOutlier(int[] nums) {
        Map<Integer,Integer> mp=new HashMap<>();
        int t=0,res=Integer.MIN_VALUE;
        for(int x:nums)
        {
            t+=x;
            mp.put(x,mp.getOrDefault(x,0)+1);
        }
        for(int x:nums)
        {
            int out=t-x-x;
            if(mp.getOrDefault(out,0)>(out==x?1:0))
            res=Math.max(res,out);
        }
        return res;
    }
}