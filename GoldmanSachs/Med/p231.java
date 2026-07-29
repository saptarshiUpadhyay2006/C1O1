//Top K freq words

package GoldmanSachs.Med;
import java.util.*;
class p231{
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> mp=new HashMap<>();
        for(String w:words) {
            mp.put(w,mp.getOrDefault(w,0)+1);
        }
        PriorityQueue<String> pq=new PriorityQueue<>(
            (a, b)->{
                int fa=mp.get(a);
                int fb=mp.get(b);
                if(fa==fb)
                    return a.compareTo(b);
                return fb-fa; 
            }
        );
        pq.addAll(mp.keySet());
        List<String> arr=new ArrayList<>();
        for(int i=0;i<k;i++){
            arr.add(pq.poll());
        }
        return arr;
    }
}