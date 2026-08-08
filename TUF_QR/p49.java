package TUF_QR;
import java.util.*;
class p49{
    public boolean canFinish(int N, int[][] arr) {
        ArrayList<Integer> adj[]=new ArrayList[N];
        for(int i=0;i<N;i++)
        adj[i]=new ArrayList<>();

        for(int it[]:arr)
        {
            int u=it[0],v=it[1];
            adj[v].add(u);
        }

        int res[]=topoSort(N,adj);
        if(res.length<N)
        return false;
        
        return true;
    }
    private int[] topoSort(int V,ArrayList<Integer>[] adj)
    {
        int in[]=new int[V];
        for(int i=0;i<V;i++)
        {
            for(int it:adj[i])
            in[it]++;
        }
        int res[]=new int[V];
        int idx=0;
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<V;i++)
        {
            if(in[i]==0)
            q.add(i);
        }

        while(!q.isEmpty())
        {
            int node=q.poll();
            res[idx++]=node;
            for(int it:adj[node])
            {
                in[it]--;
                if(in[it]==0)
                q.add(it);
            }
        }
        return Arrays.copyOfRange(res,0,idx);
    }
}