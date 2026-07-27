//Max Area of Island(LC 695)
//DFS Approach

package GoldmanSachs.Med;

class p97{
    public int maxAreaOfIsland(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        boolean vis[][]=new boolean[m][n];
        int maxi=0;
        for(int r=0;r<m;r++)
        {
            for(int c=0;c<n;c++)
            {
                if(grid[r][c]==1 && !vis[r][c])
                maxi=Math.max(maxi,dfs(grid,vis,r,c));
            }
        }
        return maxi;
    }

    private int dfs(int grid[][],boolean vis[][],int r,int c)
    {
        int m=grid.length,n=grid[0].length;
        if(r<0||r>=m||c<0||c>=n||vis[r][c]||grid[r][c]==0)
        return 0;

        vis[r][c]=true;
        return 1+dfs(grid,vis,r+1,c)+dfs(grid,vis,r-1,c)+dfs(grid,vis,r,c+1)+dfs(grid,vis,r,c-1);
    }
}