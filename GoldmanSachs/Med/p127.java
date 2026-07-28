//rotate image(LC 48)
//rotating step-wise

package GoldmanSachs.Med;

class p127{
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