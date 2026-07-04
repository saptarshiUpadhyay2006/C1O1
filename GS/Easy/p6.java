//K diff pairs in an Array(LC 532)
//Brute force----HashMap & Two pointer app--T.C:O(n)------S.C:O(n)
//USING THE LC TEMPLATE

package GS.Easy;
import java.util.*;

class Solution {
    public int findPairs(int[] nums, int k) {
        if(nums==null||nums.length==0||k<0)
        return 0;
        int c=0;
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i:nums)
        mp.put(i,mp.getOrDefault(i,0)+1);
        for(Map.Entry<Integer,Integer> el:mp.entrySet())
        {
            if((mp.containsKey(el.getKey()+k) && k!=0)||(k==0 && el.getValue()>1))
            c++;
        }
        return c;
    }
}