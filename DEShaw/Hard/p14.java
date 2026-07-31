//Allocate mailboxes(LC 1478)
//DP

package DEShaw.Hard;
import java.util.*;
class p14{
    public int minDistance(int[] houses, int k) {
        Arrays.sort(houses);
        int n=houses.length,b[]=new int[n+1],dp[]=new int[n];
        for(int i=0;i<n;i++)
        {
            b[i+1]=b[i]+houses[i];
            dp[i]=(int)1e6;
        }
        for(int f=1;f<=k;++f)
        {
            for(int j=n-1;j>f-2;--j)
            {
                for(int i=f-2;i<j;++i)
                {
                    int m1=(i+j+1)/2,m2=(i+j+2)/2;
                    int last=(b[j+1]-b[m2])-(b[m1+1]-b[i+1]);
                    dp[j]=Math.min(dp[j],(i>=0?dp[i]:0)+last);
                }
            }
        }
        return dp[n-1];
    }
}