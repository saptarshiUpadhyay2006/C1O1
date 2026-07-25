//Kth largest el in the array(LC 215)
//Use a priority Queue of size k

package GoldmanSachs.Med;
import java.util.*;
class p37{
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