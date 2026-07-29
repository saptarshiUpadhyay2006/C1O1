//Best time to buy & sell stock III
//using a 3D DP

package GoldmanSachs.Med;

class p155{
    private int fac(int arr[],int n)
    {
        int dp[][][]=new int[n+1][2][3];
        for(int i=n-1;i>=0;i--)
        {
            for(int b=0;b<=1;b++)
            {
                for(int c=1;c<=2;c++)
                {
                    if(b==0)
                    dp[i][b][c]=Math.max(0+dp[i+1][0][c],(-1)*arr[i]+dp[i+1][1][c]);
                    if(b==1)
                    dp[i][b][c]=Math.max(0+dp[i+1][1][c],arr[i]+dp[i+1][0][c-1]);
                }
            }
        }
        return dp[0][0][2];
    }
    public int maxProfit(int[] prices) {
        int n=prices.length;
        return fac(prices,n);
    }
}