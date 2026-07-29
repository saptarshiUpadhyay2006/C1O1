//Minm Number of Refueling Stops(LC 871)
//Using a priorityQueue

package GoldmanSachs.Med;
import java.util.*;
class p136{
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