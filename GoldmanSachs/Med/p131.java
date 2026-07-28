//Best time to buy & sell stock IV(LC 188)
//Using a 3D DP

package GoldmanSachs.Med;

class p131{
    public int maxProfit(int k, int[] prices) {
        int n=prices.length;
        return fac(prices,n,k);
    }

    private int fac(int arr[],int n,int k)
    {
        int dp[][][]=new int[n+1][2][k+1];
        for(int i=n-1;i>=0;i--)
        {
            for(int b=0;b<=1;b++)
            {
                for(int c=1;c<=k;c++)
                {
                    if(b==0)
                    dp[i][b][c]=Math.max(0+dp[i+1][0][c],(-1)*arr[i]+dp[i+1][1][c]);
                    if(b==1)
                    dp[i][b][c]=Math.max(0+dp[i+1][1][c],arr[i]+dp[i+1][0][c-1]);
                }
            }
        }
        return dp[0][0][k];
    }
}