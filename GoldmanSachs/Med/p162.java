//kth largest element in a stream(LC 703)
//Use a min Heap

package GoldmanSachs.Med;
import java.util.*;
class KthLargest {
    private int k;
    private PriorityQueue<Integer> mh;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        mh=new PriorityQueue<>(k);
        for(int n:nums)
        {
            if(mh.size()<k)
            mh.offer(n);
            else if(n>mh.peek())
            {
                mh.offer(n);
                if(mh.size()>k)
                mh.poll();
            }
        }
    }
    
    public int add(int val) {
        if(mh.size()<k)
        mh.offer(val);
        else if(val>mh.peek())
        {
            mh.offer(val);
            mh.poll();
        }
        return mh.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */