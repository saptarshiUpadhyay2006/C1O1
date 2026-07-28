//Minm no of arrows to burst balloons

package GoldmanSachs.Med;
import java.util.*;
class p135{
    public int findMinArrowShots(int[][] points) {
        if(points.length==0){
            return 0;
        }
        Arrays.sort(points,(a,b)->Integer.compare(a[1], b[1]));
        int ap=points[0][1];
        int ac=1;
        for(int i=1;i<points.length;i++){
            if(ap>=points[i][0]){
                continue;
            }
            ac++;
            ap=points[i][1];
        }
        return ac;
    }
}