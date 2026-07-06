//Merge Intervals(LC 56)
//Optimal-----Sort intervals acc to st time & traverse,merge------T.C:O(nlogn)------S.C:O(n)
//USING THE LC TEMPLATE
package Google.Medium;
import java.util.*;

class p3{
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->(a[0]-b[0]));
        LinkedList<int[]> arr=new LinkedList<>();
        for(int in[]:intervals)
        {
            if(arr.isEmpty()||arr.getLast()[1]<in[0])
            arr.add(in);
            else
            arr.getLast()[1]=Math.max(arr.getLast()[1],in[1]);
        }
        return arr.toArray(new int[arr.size()][2]);
    }
}