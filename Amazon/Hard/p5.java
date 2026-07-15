//Race car(LC 818)
//Optimal Approach----T.C:O(TlogT)------S.C:O(TlogT)
//USING THE LC TEMPLATE
package Amazon.Hard;
import java.util.*;

class p5{
    public int racecar(int target) {
        int dp[]=new int[target+1];
        int n=1;
        for(int i=1;i<=target;i++)
        {
            if(i==(1<<n)-1)
            {
                dp[i]=n;
                n++;
            }
            else{
                dp[i]=Integer.MAX_VALUE;
                for(int j=0;j<n-1;j++)
                dp[i]=Math.min(dp[i],n+j+1+dp[i-((1 << (n - 1)) - (1 << j))]);
                
                dp[i]=Math.min(dp[i],n+1+dp[(1<<n)-1-i]);
            }
        }
        return dp[target];
    }
}