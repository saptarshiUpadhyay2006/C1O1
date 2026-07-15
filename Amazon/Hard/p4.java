//Find median from data stream(LC 295)
//Optimal Approach----T.C:O(m*n)------S.C:O(n)
//USING THE LC TEMPLATE

package Amazon.Hard;
import java.util.*;
class MedianFinder {
    PriorityQueue<Integer> mini=new PriorityQueue<>();
    PriorityQueue<Integer> maxi=new PriorityQueue<>(Collections.reverseOrder());
    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        maxi.offer(num);
        mini.offer(maxi.poll());
        if(mini.size()>maxi.size())
        maxi.offer(mini.poll());
    }
    
    public double findMedian() {
        if(maxi.size()>mini.size())
        return maxi.peek();
        return (mini.peek()+maxi.peek())/2.0d;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */