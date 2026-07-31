//Rotting oranges(LC 994)
//dfs traversal

package DEShaw.Medium;

class p28{
    public int orangesRotting(int[][] grid) {
        if(grid==null||grid.length==0)
        return -1;

        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]==2)
                dfs(grid,i,j,2);
            }
        }
        int maxi=2;
        for(int r[]:grid)
        {
            for(int c:r)
            {
                if(c==1)
                return -1;
                maxi=Math.max(maxi,c);
            }
        }
        return maxi-2;
    }

    private void dfs(int grid[][],int i,int j,int mins)
    {
        if(i<0||i>=grid.length||j<0||j>=grid[0].length||(1<grid[i][j] && grid[i][j]<mins)||grid[i][j]==0)
        return;
        else{
            grid[i][j]=mins;
            dfs(grid,i-1,j,mins+1);
            dfs(grid,i+1,j,mins+1);
            dfs(grid,i,j-1,mins+1);
            dfs(grid,i,j+1,mins+1);
        }
    }
}