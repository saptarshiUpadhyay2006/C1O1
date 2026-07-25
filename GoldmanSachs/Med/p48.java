//Sort jumbled numbers(LC 2191)
//using the map DS

package GoldmanSachs.Med;
import java.util.*;
class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        Map<Integer,Integer> mp=new HashMap<>();
        for(int x:nums)
        {
            if(!mp.containsKey(x))
            mp.put(x,find(x,mapping));
        }
        Integer arr[]=Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(arr,(a,b)->Integer.compare(mp.get(a),mp.get(b)));
        for(int i=0;i<nums.length;i++)
        nums[i]=arr[i];

        return nums;
    }

    private int find(int num,int map[])
    {
        if(num==0)
        return map[0];

        int res=0;
        int cm=1;
        while(num>0)
        {
            int d=num%10;
            num/=10;
            res+=map[d]*cm;
            cm*=10;
        }
        return res;
    }
}