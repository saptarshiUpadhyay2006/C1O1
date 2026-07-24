//Pascal's Triangle(LC 118)

package GoldmanSachs.Med;
import java.util.*;
class p36{
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr=new ArrayList<>();
        int n=numRows;
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                if(j==0||i==j)
                a[i][j]=1;
                else
                a[i][j]=a[i-1][j-1]+a[i-1][j];
            }
        }
        for(int i=0;i<n;i++)
        {
            List<Integer> r=new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                r.add(a[i][j]);
            }
            arr.add(r);
        }
        return arr;
    }
}