//Jump Game(LC 55)
//Using a HashMap

package GoldmanSachs.Med;
import java.util.*;
class p53{
    HashMap<Integer,Boolean> mp;
    public boolean canJump(int[] nums) {
        mp=new HashMap<>();
        return fac(nums,0);
    }
    private boolean fac(int nums[],int i)
    {
        if(i==nums.length-1)
        return true;
        if(i>=nums.length||nums[i]==0)
        return false;

        if(mp.containsKey(i))
        return false;
        boolean b=false;
        for(int j=1;j<=nums[i];j++)
        {
            b=fac(nums,i+j);
            if(b)
            return true;
        }
        mp.put(i,false);

        return false;
    }
}