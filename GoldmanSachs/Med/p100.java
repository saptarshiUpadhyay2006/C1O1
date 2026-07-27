//Minm initial energy to finish tasks(LC 1665)
//POV-Greedy sort...think like a loan system.

package GoldmanSachs.Med;
import java.util.*;
class p100{
    public int minimumEffort(int[][] tasks) {
        Arrays.sort(tasks,(a,b)->b[1]-b[0]-(a[1]-a[0]));
        int st=tasks[0][1],bal=tasks[0][1]-tasks[0][0];
        int l=0;
        for(int i=1;i<tasks.length;i++)
        {
            int cs=tasks[i][0];
            int th=tasks[i][1];
            if(bal<th)
            {
                l+=th-bal;
                bal=th;
            }
            bal-=cs;
        }
        return st+l;
    }
}