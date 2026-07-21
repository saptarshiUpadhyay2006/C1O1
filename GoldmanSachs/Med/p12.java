//Merge Intervals(LC56)
//Using two lists and compare accordingly after sorting at first  

package GoldmanSachs.Med;
import java.util.*;
class p12{
    public int[][] merge(int[][] intervals) {
       Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
       List<int[]> res=new ArrayList<>();
       int pre[]=intervals[0];

       for(int i=1;i<intervals.length;i++)
       {
        int curr[]=intervals[i];
        if(curr[0]<=pre[1])
        pre[1]=Math.max(pre[1],curr[1]);
        else
        {
            res.add(pre);
            pre=curr;
        }
       }
       res.add(pre);
       return res.toArray(new int[res.size()][]);
    }
}