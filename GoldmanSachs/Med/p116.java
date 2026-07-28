//Path with Maxm gold(LC 1219)
//DFS Traversal

package GoldmanSachs.Med;

class p116{
    public int getMaximumGold(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        int maxi=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]!=0)
                maxi=Math.max(maxi,dfs(grid,i,j,m,n));
            }
        }
        return maxi;
    }

    private int dfs(int grid[][],int x,int y,int m,int n)
    {
        if(x<0||x>=m||y<0||y>=n||grid[x][y]==0)
        return 0;
        
        int curr=grid[x][y];
        grid[x][y]=0;

        int maxi=curr;
        maxi=Math.max(maxi,curr+dfs(grid,x+1,y,m,n));
        maxi=Math.max(maxi,curr+dfs(grid,x-1,y,m,n));
        maxi=Math.max(maxi,curr+dfs(grid,x,y+1,m,n));
        maxi=Math.max(maxi,curr+dfs(grid,x,y-1,m,n));

        grid[x][y]=curr;
        return maxi;
    }
}