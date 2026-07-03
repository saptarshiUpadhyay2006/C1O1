//Print first N rows of Pascal's Triangle
//Single Approach---T.C:O(N^2)------S.C:O(N^2)
//USING THE LC TEMPLATE
package Amazon.Easy;
import java.util.*;

class p5{
    public List<List<Integer>> generate(int numRows) {
        int n=numRows;
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                if(j==0||i==j)
                arr[i][j]=1;
                else
                arr[i][j]=arr[i-1][j-1]+arr[i-1][j];

            }
        }
        List<List<Integer>> l=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            List<Integer> r=new ArrayList<>();
            for(int j=0;j<=i;j++)
            {
                r.add(arr[i][j]);
            }
            l.add(r);
        }
        return l;
    }
}