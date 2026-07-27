//Search a 2D Matrix(LC 74)
//While loop traversal with a pointer type approach

package GoldmanSachs.Med;

class p90{
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0,m=matrix.length,n=matrix[0].length,j=n-1;
        while(i>=0 && i<m && j>=0 && j<n)
        {
            if(matrix[i][j]==target)
            return true;
            else if(matrix[i][j]>target)
            j--;
            else if(matrix[i][j]<target)
            i++;
        }
        return false;
    }
}