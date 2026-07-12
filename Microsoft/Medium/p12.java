//Reorganize String(LC 767)
//Optimal---Use PQ---T.C:O(nlogk)------S.C:O(k)
//USING THE LC TEMPLATE

package Microsoft.Medium;
import java.util.*;
class p12{
    public String reorganizeString(String s) {
        int cc[]=new int[26];
        for(char c:s.toCharArray())
        cc[c-'a']=cc[c-'a']+1;

        var pq=new PriorityQueue<int[]>((a,b)->Integer.compare(b[1],a[1]));
        for(int i=0;i<26;i++)
        {
            if(cc[i]>0)
            pq.offer(new int[]{i+'a',cc[i]});
        }
        StringBuilder sb=new StringBuilder();
        int bl[]=pq.poll();
        sb.append((char)bl[0]);
        bl[1]--;
        while(!pq.isEmpty())
        {
            int nxt[]=pq.poll();
            sb.append((char)nxt[0]);
            nxt[1]--;
            if(bl[1]>0)
            pq.offer(bl);

            bl=nxt;
        }
        if(bl[1]>0)
        return "";
        else
        return sb.toString();
    }
}