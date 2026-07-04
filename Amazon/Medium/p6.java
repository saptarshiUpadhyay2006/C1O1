//Meeting Rooms II(LC 253)---Premium ki mkc
//Optimal Approach---Use Map----T.C:O(nlogn)------S.C:O(n)
//USING THE LC TEMPLATE
package Amazon.Medium;
import java.util.*;

class Solution {
    public int meetingRooms(int arr[][]) {
        TreeMap<Integer,Integer> mp=new TreeMap<>();
        int s=0,c=0;
        for(int i[]:arr)
        {
            int st=i[0],e=i[1];
            mp.put(st,mp.get(mp.getOrDefault(st,0)+1));
            mp.put(e,mp.get(mp.getOrDefault(e,0)-1));
        }
        for(int k:mp.keySet())
        {
            c+=mp.get(k);
            s=Math.max(s,c);
        }
        return s;
    }
}