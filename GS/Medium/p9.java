//Spiral Matrix(LC 54)
//Optimal----Use 4ptrs---T.C:O(n)------S.C:O(n)
//USING THE LC TEMPLATE
package GS.Medium;
import java.util.*;
class p9{
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length,n=matrix[0].length;
        int t=0,b=m-1,l=0,r=n-1;
        List<Integer> arr=new ArrayList<>();
        while(t<=b && l<=r)
        {
            for(int i=l;i<=r;i++)
            arr.add(matrix[t][i]);
            t++;

            for(int i=t;i<=b;i++)
            arr.add(matrix[i][r]);
            r--;

            if(t<=b)
            {
                for(int i=r;i>=l;i--)
                arr.add(matrix[b][i]);
                b--;
            }

            if(l<=r)
            {
                for(int i=b;i>=t;i--)
                arr.add(matrix[i][l]);
                l++;
            }
        }
        return arr;
    }
}