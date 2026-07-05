//kth row of pascal triangle(LC 119)
//Optimal----Observe the pattern-----T.C:O(n)------S.C:O(1)
//USING THE LC TEMPLATE
package Google.Easy;
import java.util.*;

class p1{
    public List<Integer> getRow(int rowIndex) {
        int n=rowIndex;
        int arr[]=new int[n+1];
        arr[0]=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=i;j>0;j--)
            arr[j]+=arr[j-1];
        }
        List<Integer> l=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        l.add(arr[i]);
        return l;
    }

}