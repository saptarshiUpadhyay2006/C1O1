//Minm falling path sum(LC 931)
//Using dp(memoziation)

package GoldmanSachs.Med;
import java.util.*;
class p46{
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        int dp[][]=new int[n][n];
        for(int row[]:dp)
        Arrays.fill(row,Integer.MAX_VALUE);

        int ms=Integer.MAX_VALUE;
        for(int c=0;c<n;c++)
        {
            ms=Math.min(ms,find(0,c,matrix,dp));
        }
        return ms;
    }

    private int find(int r,int c,int matrix[][],int dp[][])
    {
        int n=matrix.length;
        if(c<0||c>=n)
        return Integer.MAX_VALUE/2;

        if(r==n-1)
        return matrix[r][c];

        if(dp[r][c]!=Integer.MAX_VALUE)
        return dp[r][c];

        int down=matrix[r][c]+find(r+1,c,matrix,dp);
        int dl=matrix[r][c]+find(r+1,c-1,matrix,dp);
        int dr=matrix[r][c]+find(r+1,c+1,matrix,dp);
        return dp[r][c]=Math.min(down,Math.min(dl,dr));
    }
}