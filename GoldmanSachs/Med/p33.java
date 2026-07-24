//Range Pdt Queries of powers(LC 2438)

package GoldmanSachs.Med;
import java.util.*;
class p33{
    public int[] productQueries(int n, int[][] queries) {
        final int MOD = 1000000007;
        List<Integer> arr=new ArrayList<>();
        while(n>0)
        {
            int lb=n & -n;
            arr.add(lb);
            n^=lb;
        }
        int sz=arr.size();
        int tab[][]=new int[sz][sz];
        for(int r=0;r<sz;r++)
        {
            tab[r][r]=arr.get(r);
            for(int c=r+1;c<sz;c++)
            tab[r][c]=(int)((long)tab[r][c-1]*arr.get(c)%MOD);
        }
        int res[]=new int[queries.length];
        for(int i=0;i<queries.length;i++)
        {
            int p=queries[i][0];
            int q=queries[i][1];
            res[i]=tab[p][q];
        }
        return res;
    }
}