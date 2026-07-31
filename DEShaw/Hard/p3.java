//No of subarrays with AND value of K

package DEShaw.Hard;
import java.util.*;
class p3{
    public long countSubarrays(int[] nums, int k) {
        HashMap<Integer, Integer> mp=new HashMap<>();
        long res=0;
        for(int i=0;i<nums.length;i++){
            int cv=nums[i];
            if(cv==k)
                res++;
            HashMap<Integer, Integer> curr=new HashMap<>();
            for (int key:mp.keySet()){
                int andVal=key&cv;
                if(andVal==k){
                    res+=mp.get(key);
                }
                curr.put(andVal,curr.getOrDefault(andVal,0)+mp.get(key));
            }
            curr.put(cv,curr.getOrDefault(cv,0)+1);
            mp=curr;
        }
        return res;
    }
}