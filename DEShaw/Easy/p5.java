//Majority element(LC 169)
//using a map DS

package DEShaw.Easy;
import java.util.*;
class p5{
    public int majorityElement(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        n/=2;
        for(Map.Entry<Integer,Integer> en:mp.entrySet())
        {
            if(en.getValue()>n)
            return en.getKey();
        }
        return 0;
    }
}