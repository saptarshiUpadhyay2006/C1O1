//Equal Row & Col Pairs(LC 633)
//Optimal-----Transpose and Match----T.C:O()------S.C:O(1)
//USING THE LC TEMPLATE
package Adobe.Medium;
import java.util.*;

class p3{
    public int equalPairs(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++)
                arr[i][j]=grid[j][i];
        }
        int c=0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(Arrays.equals(grid[i],arr[j]))
                c++;
            }
        }
        return c;
    }
}