package TUF_QR;
import java.util.*;
class p47{
    private int dr[]={-1,0,1,0};
    private int dc[]={0,1,0,-1};
    private boolean val(int i,int j,int m,int n)
    {
        if(i<0||i>=m)
        return false;
        if(j<0||j>=n)
        return false;

        return true;
    }


    public int orangesRotting(int[][] grid) {
     int m=grid.length;
     int n=grid[0].length;
     int t=0,tot=0,c=0;
     Queue<int[]> q=new LinkedList<>();

     for(int i=0;i<m;i++)
     {
        for(int j=0;j<n;j++)
        {
            if(grid[i][j]!=0)
            tot++;
            if(grid[i][j]==2)
            q.add(new int[]{i,j});
        }
     }

     while(!q.isEmpty())
     {
        int k=q.size();
        c+=k;
        while(k-->0)
        {
            int cell[]=q.poll();
            int row=cell[0],col=cell[1];
            for(int i=0;i<4;i++)
            {
                int nr=row+dr[i];
                int nc=col+dc[i];
                if(val(nr,nc,m,n) && grid[nr][nc]==1)
                {
                    grid[nr][nc]=2;
                    q.add(new int[]{nr,nc});
                }
            }
        }
        if(!q.isEmpty())
        t++;
     }
     if(tot==c)
     return t;
     return -1;
    }
}


