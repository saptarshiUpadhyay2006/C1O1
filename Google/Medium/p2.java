//Rotate Image-Matrix(LC 48)
//Optimal----Swapping as we need for in-place-----T.C:O(n^2)------S.C:O(1)
//USING THE LC TEMPLATE
package Google.Medium;


class Solution {
    public void rotate(int[][] matrix) {
        int r=matrix.length,c=matrix[0].length;
        for(int i=0;i<r;i++)
        {
            for(int j=i+1;j<c;j++)
            {
                int d=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=d;
            }
        }

        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c/2;j++)
            {
                int d=matrix[i][c-1-j];
                matrix[i][c-1-j]=matrix[i][j];
                matrix[i][j]=d;
            }
        }
    }

}