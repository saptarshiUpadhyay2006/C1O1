package TUF_QR;
import java.util.*;
class p48{
    public int[] topoSort(int V, List<List<Integer>> adj) {
        int res[]=new int[V];
        int in[]=new int[V];
        for(int i=0;i<V;i++)
        {
            for(int it:adj.get(i))
            in[it]++;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<V;i++)
        {
            if(in[i]==0)
            q.add(i);
        }

        int idx=0;
        while(!q.isEmpty())
        {
            int node=q.poll();
            res[idx++]=node;
            for(int it:adj.get(node))
            {
                in[it]--;
                if(in[it]==0)
                q.add(it);
            }
        }
        return res;
    }
}
