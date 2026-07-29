//Game of life
//move in iteration only and change accordingly with nx & ny

package GoldmanSachs.Med;

class p145{
    public void gameOfLife(int[][] board) {
        int m=board.length,n=board[0].length;
        int arr[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            arr[i]=board[i].clone();
        }
        int dirs[][]={{-1,-1},{-1,0},{-1,1},{0,-1},{0,1},{1,-1},{1,0},{1,1}};
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                int s=0;
                for(int d[]:dirs)
                {
                    int nx=i+d[0],ny=j+d[1];
                    if(nx<0||nx>=m||ny<0||ny>=n)
                    continue;
                    if(board[nx][ny]==1)
                    s++;
                }
                if(board[i][j]==1)
                {
                    if(s<2||s>3)
                    arr[i][j]=0;
                }
                else
                {
                    if(s==3)
                    arr[i][j]=1;
                }
            }
        }
        for(int i=0;i<m;i++)
        board[i]=arr[i].clone();
    }
}