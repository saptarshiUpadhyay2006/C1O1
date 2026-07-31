//Minm no of refueling stops(LC 871)
//Min heap

package DEShaw.Hard;
import java.util.*;
class p9{
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        int n=stations.length;
        long maxi=startFuel;
        int i=0,res=0;
        PriorityQueue<Integer> pq =new PriorityQueue<>(Collections.reverseOrder());
        while(true){
            if(maxi>=target)
                return res;
            while(i<n&&stations[i][0]<=maxi)
            {
                pq.offer(stations[i][1]);
                i++;
            }
            if(!pq.isEmpty()){
                maxi+=pq.poll();
            } 
            else
                return -1;
            res++;
        }
    }
}