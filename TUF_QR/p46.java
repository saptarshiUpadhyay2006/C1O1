package TUF_QR;
import java.util.*;
class p46{
    public boolean isBipartite(int V, List<List<Integer>> edges) {
      int color[]=new int[V];
      Arrays.fill(color,-1);
      List<List<Integer>> adj=new ArrayList<>(V);
      for(int i=0;i<V;i++)
      adj.add(new ArrayList<>());

      for(List<Integer> e:edges)
      {
        int u=e.get(0),v=e.get(1);
        adj.get(u).add(v);
        adj.get(v).add(u);
      }
      for(int i=0;i<V;i++)
      {
        if(color[i]==-1)
        {
            if(!bfs(i,adj,color))//dfs(i,0,color,adj);
            return false;
        }
      }
      return true;
    }

    private boolean bfs(int start,List<List<Integer>> adj,int color[])
    {
        Queue<Integer> q=new LinkedList<>();
        q.offer(start);
        color[start]=0;
        while(!q.isEmpty())
        {
            int node=q.poll();
            for(int it:adj.get(node))
            {
                if(color[it]==-1)
                {
                    color[it]=1-color[node];
                    q.offer(it);
                }
                else if(color[it]==color[node])
                return false;
            }
        }
        return true;
    }

    private boolean dfs(int node,int col,int color[],List<List<Integer>> adj)
    {
        color[node]=col;
        for(int it:adj.get(node))
        {
            if(color[it]==-1)
            {
                if(!dfs(it,1-col,color,adj))
                return false;
            }
        }
        return true;
    }
}

