//Top K freq elements(LC 347)
//using a hashMap & Comparing

package GoldmanSachs.Med;
import java.util.*;
class p41{
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int el:nums)
        mp.put(el,mp.getOrDefault(el,0)+1);

        ArrayList<Map.Entry<Integer,Integer>> arr=new ArrayList<>(mp.entrySet());

        arr.sort((a,b)->b.getValue()-a.getValue());

        int a[]=new int[k];
        for(int i=0;i<k;i++)
        a[i]=arr.get(i).getKey();

        return a;
    }
}