//Super egg drop(LC 887)
//Optimal Approach----T.C:O(n.klogn)------S.C:O(n.k)
//USING THE LC TEMPLATE

package GS.Hard;

class p4{
    public int superEggDrop(int k, int n) {
        int dp[][]=new int[n+1][k+1];
        for(int i=1;i<=k;i++)
        {
            dp[0][i]=0;
            dp[1][i]=1;
        }
        for(int i=1;i<=n;i++)
        {
            dp[i][1]=i;
            dp[i][0]=Integer.MAX_VALUE;
        }
        for(int i=2;i<=n;i++)
        {
            for(int j=2;j<=k;j++)
            {
                int l=1,h=i,t=0,res=Integer.MAX_VALUE;
                while(l<=h)
                {
                    int m=(l+h)/2;
                    int le=dp[m-1][j-1];
                    int ri=dp[i-m][j];
                    t=1+Math.max(le,ri);
                    if(le<ri)
                    l=m+1;
                    else
                    h=m-1;

                    res=Math.min(res,t);
                }
                dp[i][j]=res;
            }
        }
        return dp[n][k];
    }
}