//Subsets(LC 78)
//Using loopwise listing

package GoldmanSachs.Med;
import java.util.*;
class p185{
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> arr=new ArrayList<>();
        arr.add(new ArrayList<>());

        for(int i:nums)
        {
            int n=arr.size();
            for(int j=0;j<n;j++)
            {
                List<Integer> sub=new ArrayList<>(arr.get(j));
                sub.add(i);
                arr.add(sub);
            }
        }
        return arr;
    }
}