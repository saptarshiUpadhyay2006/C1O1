//Finding active user mins(LC 1817)
//Optimal----Map HashSet to another HashSet-----T.C:O(n)------S.C:O(n)
//USING THE LC TEMPLATE

package Atlassian.Medium;
import java.util.*;

class p1{
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        HashMap<Integer,HashSet<Integer>> mp=new HashMap<>();
        for(int a[]:logs)
        {
            int u=a[0],v=a[1];
            if(!mp.containsKey(u))
            {
                mp.put(u,new HashSet<>());
                mp.get(u).add(v);
            }
            else
            mp.get(u).add(v);
        }
        int arr[]=new int[k];
        for(int i:mp.keySet())
        {
            HashSet<Integer> hs=mp.get(i);
            arr[hs.size()-1]++;
        }
        return arr;
    }
}