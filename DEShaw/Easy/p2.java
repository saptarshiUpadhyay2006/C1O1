//Take gifts from the richest pile(LC 2558)
//use a min heap

package DEShaw.Easy;
import java.util.*;
class p2{
    public long pickGifts(int[] gifts, int k) {
        int n=gifts.length;
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->(b-a));
        for(int i=0;i<n;i++)
        pq.add(gifts[i]);

        long s=0;
        while(k-->0)
        pq.add((int)Math.sqrt(pq.remove()));
        
        while(pq.size()>0)
        s+=pq.remove();

        return s;
    }
}