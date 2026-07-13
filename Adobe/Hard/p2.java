//Unique paths III(LC 980)
//Optimal----DFS & Backtracking-----T.C:O(3^(m.n))------S.C:O(m.n)
//USING THE LC TEMPLATE

package Adobe.Hard;
import java.util.*;

class Solution {
    int res=0,em=1;
    private void dfs(int grid[][],int x,int y,int c)
    {
        if(x<0||x>=grid.length||y<0||y>=grid[0].length||grid[x][y]==-1)
        return;

        if(grid[x][y]==2)
        {
            if(em==c)
            res++;

            return;
        }
        grid[x][y]=-1;
        dfs(grid,x+1,y,c+1);
        dfs(grid,x-1,y,c+1);
        dfs(grid,x,y+1,c+1);
        dfs(grid,x,y-1,c+1);

        grid[x][y]=0;
    }
    public int uniquePathsIII(int[][] grid) {
        int sx=0,sy=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==1)
                {
                    sx=i;
                    sy=j;
                }
                else if(grid[i][j]==0)
                em++;
            }
        }
        dfs(grid,sx,sy,0);
        return res;
    }
}