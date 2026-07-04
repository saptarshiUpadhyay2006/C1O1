//Find k closest elements(LC 658)
//Optimal Approach---Use Min Heap(PQ)----T.C:O(nlogk+klogk)------S.C:O(k)
//USING THE LC TEMPLATE
package Amazon.Medium;
import java.util.*;

class p4{
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        List<Integer> l=new ArrayList<>();

        for(int i:arr)
        {
            if(k>0)
            {
                pq.offer(i);
                k--;
            }
            else if(Math.abs(pq.peek()-x)>Math.abs(i-x))
            {
                pq.poll();
                pq.offer(i);
            }
        }
        while(!pq.isEmpty())
        {
            l.add(pq.poll());
        }
        return l;
    }
}