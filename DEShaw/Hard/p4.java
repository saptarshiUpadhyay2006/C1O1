//Find sum of power of all subseq(LC 3082)
//DP

package DEShaw.Hard;

class p4{
    public int sumOfPower(int[] nums, int k) {
        int n=nums.length,mod=(int)1e9+7,res=0,p2= 1;
        int dp[][]=new int[n + 1][k + 1];
        dp[0][0]=1;
        for(int a:nums)
            for(int v=k;v>=a;--v)
                for(int i=n;i>0;--i)
                    dp[i][v]=(dp[i][v]+dp[i-1][v-a])%mod;
        for(int i=n;i>0;--i)
        {
            res=(int)(res+(1L*p2*dp[i][k])%mod)%mod;
            p2=(p2*2)%mod;
        }
        return res;
    }
}