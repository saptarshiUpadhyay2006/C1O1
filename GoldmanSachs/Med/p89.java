//Find Median from Data Stream(LC 295)
//using min & max PQ

package GoldmanSachs.Med;
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