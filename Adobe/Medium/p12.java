//Search a 2D matrix(LC 74)
//Optimal-----Use while loop----T.C:O(m+n)------S.C:O(1)
//USING THE LC TEMPLATE
package Adobe.Medium;
import java.util.*;

class p12{
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