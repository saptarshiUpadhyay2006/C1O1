//Sum in a matrix(LC 2679)
//Optimal-----Sort & extract----T.C:O(mnlogn)------S.C:O(1)
//USING THE LC TEMPLATE

package Adobe.Medium;
import java.util.*;
class p13{
    public int matrixSum(int[][] nums) {
        int s=0,m=nums.length,n=nums[0].length;
        for(int r[]:nums)
        Arrays.sort(r);

        for(int j=0;j<n;j++)
        {
            int x=0;
            for(int i=0;i<m;i++)
            x=Math.max(x,nums[i][j]);

            s+=x;
        }
        return s;
    }
}