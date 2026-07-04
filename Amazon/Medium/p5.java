//kth largest element in array(LC 215)
//Optimal Approach---Use Min Heap(PQ)----T.C:O(nlogk)------S.C:O(k)
//USING THE LC TEMPLATE
package Amazon.Medium;
import java.util.PriorityQueue;

class p5{
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int x:nums)
        {
            pq.add(x);
            if(pq.size()>k)
            pq.poll();
        }
        return pq.peek();
    }
}