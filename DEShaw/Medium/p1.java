//Furthest Building You Can Reach(LC 1642)
//Optimal----3D DP will give TLE, Greedy supremacy(Min heap)----T.C:O(nLogl)------S.C:O(l)
//USING THE LC TEMPLATE

package DEShaw.Medium;
import java.util.*;
class p1{
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        int n=heights.length;
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
        for(int i=0;i<n-1;i++) {
            int d=heights[i+1]-heights[i];
            if(d>0)
            {
                if(pq.size()<ladders) {
                    pq.add(d);
                }
                else
                {
                    if(pq.isEmpty()||pq.peek()>=d){
                        bricks-=d;
                    } 
                    else 
                    {
                        int poll=pq.poll();
                        pq.add(d);
                        bricks-=poll;
                    }
                    if(bricks<0) 
                    return i;
                }
            }
        }
        return n-1;
    }
}