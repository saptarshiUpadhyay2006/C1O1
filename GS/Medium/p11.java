//Knight prob in Chessboard(LC 688)
//Optimal---3D DP-----T.C:O(n)------S.C:O(n)
//USING THE LC TEMPLATE
package GS.Medium;

class p11{
    public double knightProbability(int n, int k, int row, int column) {
        int directions[][]= {{-2, -1}, {-2, 1}, {-1, -2}, {-1, 2}, {1, -2}, {1, 2}, {2, -1}, {2, 1}};
        double dp[][][]=new double[k+1][n][n];
        dp[0][row][column]=1.0;
        for(int m=1;m<=k;m++)
        {
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    for(int dir[]:directions)
                    {
                        int pi=i-dir[0];
                        int pj=j-dir[1];
                        if(pi>=0 && pi<n && pj>=0 && pj<n)
                        dp[m][i][j]+=dp[m-1][pi][pj]/8.0;
                    }
                }
            }
        }

        double p=0.0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            p+=dp[k][i][j];
        }
        return p;
    }
}