//Permutations(LC 46)
//Optimal---Use visited and try possible outcome--T.C:O(n.n!)------S.C:O(n)
//USING THE LC TEMPLATE
package Google.Medium;
import java.util.*;

class Solution {
    List<List<Integer>> arr;
    public List<List<Integer>> permute(int[] nums) {
        arr=new LinkedList<>();
        fac(nums,new ArrayList<>());
        return arr;
    }
    private void fac(int nums[],List<Integer> l)
    {
        if(l.size()==nums.length)
        {
            arr.add(new ArrayList(l));
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=-1)
            {
                int t=nums[i];
                l.add(t);
                nums[i]=-1;
                fac(nums,l);
                l.remove(l.size()-1);
                nums[i]=t;
            }
        }
    }
}