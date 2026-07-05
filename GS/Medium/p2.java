//Minm area of Rectangle(LC 939)
//Optimal Soln----hashMap & HashSet-----T.C:O(n^2)------S.C:O(n)
//USING THE LC TEMPLATE
package GS.Medium;
import java.util.*;

class Solution {
    public int minAreaRect(int[][] points) {
        int n=points.length;
        boolean b=false;
        Map<Integer,Set<Integer>> mp=new HashMap<>();
        for(int p[]:points)
        {
            if(!mp.containsKey(p[0]))
            mp.put(p[0],new HashSet<>());

            mp.get(p[0]).add(p[1]);
        }
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(points[i][0]==points[j][0]||points[i][1]==points[j][1])
                continue;
                if(mp.get(points[i][0]).contains(points[j][1]) && mp.get(points[j][0]).contains(points[i][1]))
                {
                    b=true;
                    mini=Math.min(mini,Math.abs(points[i][0]-points[j][0])*Math.abs(points[i][1]-points[j][1]));
                }
            }
        }
        if(b)
        return mini;
        return 0;
    }
}