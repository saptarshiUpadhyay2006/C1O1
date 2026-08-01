package TUF_QR;
import java.util.*;
class p1{
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> arr=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            Set<Integer> hs=new HashSet<>();
            for(int j=i+1;j<n;j++)
            {
                int l=-(nums[i]+nums[j]);
                if(hs.contains(l))
                {
                    List<Integer> tm=new ArrayList<>();
                    tm.add(nums[i]);
                    tm.add(nums[j]);
                    tm.add(l);
                    Collections.sort(tm);
                    arr.add(tm);
                }
                hs.add(nums[j]);
            }
        }
        List<List<Integer>> res=new ArrayList<>(arr);
        return res;
    }
}