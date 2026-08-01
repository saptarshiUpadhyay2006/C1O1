package TUF_QR;
import java.util.*;
class p4{
    public List<Integer> majorityElementTwo(int[] nums) {
        Map<Integer,Integer> mp=new HashMap<>();
        int n=nums.length;
        int mini=n/3+1;
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
            if(mp.get(nums[i])==mini)
            res.add(nums[i]);

            if(res.size()==2)
            break;
        }
        return res;
    }
}