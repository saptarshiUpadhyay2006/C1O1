//Subarray sum equals K(LC 560)
//mapping technique

package DEShaw.Medium;
import java.util.*;
class p43{
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        mp.put(0,1);
        int t=0,c=0;
        for(int n:nums)
        {
            t+=n;
            if(mp.containsKey(t-k))
            c+=mp.get(t-k);

            mp.put(t,mp.getOrDefault(t,0)+1);
        }
        return c;
    }
}