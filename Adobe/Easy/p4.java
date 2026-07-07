//Toeplitz matrix(LC 766)
//Optimal Approach---Basic ops----T.C:O(m.n)------S.C:O(1)
//USING THE LC TEMPLATE

package Adobe.Easy;

class p4{
    public boolean isToeplitzMatrix(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=1;i<m;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(matrix[i][j]!=matrix[i-1][j-1])
                return false;
            }
        }
        return true;
    }
}