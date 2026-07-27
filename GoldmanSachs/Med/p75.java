//Skyline Problem(LC 218)
//using a treemap

package GoldmanSachs.Med;
import java.util.*;
class p75{
    public List<List<Integer>> getSkyline(int[][] buildings) {
        List<List<Integer>> arr=new ArrayList<>();
        List<int[]> lines=new ArrayList<>();
        for (int building[]:buildings) {
            lines.add(new int[] {building[0], building[2]});
            lines.add(new int[] {building[1], -building[2]});
        }
        Collections.sort(lines,(a,b)->a[0]==b[0]?b[1]-a[1]:a[0]-b[0]);
        TreeMap<Integer,Integer> mp= new TreeMap<>();
        mp.put(0, 1);
        int prev=0;
        for(int line[]:lines) {
            if(line[1]>0) {
                mp.put(line[1],mp.getOrDefault(line[1],0)+1);
            } else {
                int f=mp.get(-line[1]);
                if(f==1) 
                mp.remove(-line[1]);
                else mp.put(-line[1], f-1);
            }
            int curr=mp.lastKey();
            if (curr!=prev) {
                arr.add(Arrays.asList(line[0], curr));
                prev=curr;
            }
        }
        return arr;
    }
}