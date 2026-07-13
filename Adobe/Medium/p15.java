//Max bags with full capacity of rocks(LC 2279)
//Optimal----basic ops----T.C:O(nlogn)------S.C:O(n)
//USING THE LC TEMPLATE

package Adobe.Medium;
import java.util.*;

class p15{
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        List<Integer> arr=new ArrayList<>();
        int c=0,n=rocks.length;
        for(int i=0;i<n;i++)
        {
            arr.add(capacity[i]-rocks[i]);
        }
        Collections.sort(arr);
        for(int i=0;i<n;i++)
        {
            if(arr.get(i)<=additionalRocks)
            {
                additionalRocks=additionalRocks-arr.get(i);
                c++;
            }
        }
        return c;
    }
}