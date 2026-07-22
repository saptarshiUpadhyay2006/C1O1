//No of Islands(LC 200)
//using dfs approach

package GoldmanSachs.Med;

class p18{
    int m,n;
    public int numIslands(char[][] grid) {
        m=grid.length;
        n=grid[0].length;
        int c=0;

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]=='1')
                {
                    c++;
                    dfs(i,j,grid);
                }
            }
        }
        return c;
    }

    private void dfs(int r,int c,char grid[][])
    {
        if(r>=m||r<0||c<0||c>=n||grid[r][c]=='0')
        return;

        grid[r][c]='0';
        dfs(r+1,c,grid);
        dfs(r-1,c,grid);
        dfs(r,c+1,grid);
        dfs(r,c-1,grid);
    }
}