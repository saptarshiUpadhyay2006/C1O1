package TUF_QR;
import java.util.*;
class p12{
    public int subarraysWithXorK(int[] nums, int k) {
      int n=nums.length;
      int x=0;
      Map<Integer,Integer> mp=new HashMap<>();
      mp.put(x,mp.getOrDefault(x,0)+1);
      int c=0;
      for(int i=0;i<n;i++)
      {
        x=x^nums[i];
        int curr=x^k;
        c+=mp.getOrDefault(curr,0);
        mp.put(x,mp.getOrDefault(x,0)+1);
      }
      return c;
    }
}