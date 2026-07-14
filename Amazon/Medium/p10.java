//Course Schedule(LC 207)
//Optimal Approach----T.C:O(V+E)------S.C:O(V+E)
//USING THE LC TEMPLATE
package Amazon.Medium;
import java.util.*;
class p10{
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<Integer>[] adj=new ArrayList[numCourses];
        int in[]=new int[numCourses];
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++)
        adj[i]=new ArrayList<Integer>();

        for(int x[]:prerequisites)
        {
            adj[x[1]].add(x[0]);
            in[x[0]]++;
        }

        for(int i=0;i<numCourses;i++)
        {
            if(in[i]==0)
            q.add(i);
        }
        int c=0;
        while(!q.isEmpty())
        {
            int node=q.poll();
            c++;
            for(int j:adj[node])
            {
                if(--in[j]==0)
                q.add(j);
            }
        }
        return c==numCourses;
    }
}