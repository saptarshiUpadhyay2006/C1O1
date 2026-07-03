//Last Stone Game(LC 1046)
//Optimal Approach---Use PQ----T.C:O(nlogn)------S.C:O(n)
//USING THE LC TEMPLATE
package Amazon.Easy;
import java.util.PriorityQueue;

 class p11{
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        for(int i:stones)
        pq.offer(i);

        while(pq.size()>1)
        {
            int e1=pq.poll();
            int e2=pq.poll();
            if(e1!=e2)
            pq.offer(e1-e2);
        }

        return pq.isEmpty()?0:pq.poll();
    }
}