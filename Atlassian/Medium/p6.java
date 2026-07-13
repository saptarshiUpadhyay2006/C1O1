//Shortest Bridge(LC 934)
//Optimal----DFS+Multi-source BFS-----T.C:O(n^2)------S.C:O(n^2)
//USING THE LC TEMPLATE

package Atlassian.Medium;
import java.util.*;

class p6{
    int n;
    boolean vis[][];
    Queue<int[]> q=new LinkedList<>();
    int dir[][]={{-1,0},{1,0},{0,1},{0,-1}};
    public int shortestBridge(int[][] grid) {
        n=grid.length;
        vis=new boolean[n][n];
        boolean b=false;
        for(int i=0;i<n && !b;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==1)
                {
                    dfs(grid,i,j);
                    b=true;
                    break;
                }
            }
        }
        while(!q.isEmpty())
        {
            int node[]=q.poll();
            int r=node[0],c=node[1],v=node[2];
            for(int d[]:dir)
            {
                int nr=r+d[0],nc=c+d[1];
                if(nr>=0 && nr<n && nc>=0 && nc<n && !vis[nr][nc])
                {
                    if(grid[nr][nc]==0)
                    {
                        vis[nr][nc]=true;
                        q.offer(new int[]{nr,nc,v+1});
                    }
                    else if(grid[nr][nc]==1)
                    return v;
                }
            }
        }
        return 0;
    }

    private void dfs(int grid[][],int i,int j)
    {
        vis[i][j] = true;
        q.offer(new int[]{i, j, 0});
        for (int d[]:dir) {
            int nr=i+d[0],nc=j+d[1];
            if (nr>=0 && nr<n && nc>=0 && nc <n && !vis[nr][nc] && grid[nr][nc] == 1) {
                dfs(grid, nr, nc);
            }
        }
    }
}