//Partition Equal Subset Sum(LC 416)
//it is a 0-1 knapsack problem

package GoldmanSachs.Med;

class p154{
    public boolean canPartition(int[] nums) {
        int t=0;
        for(int x:nums)
        t+=x;

        if(t%2!=0)
        return false;
        int ts=t/2;
        boolean dp[]=new boolean[ts+1];
        dp[0]=true;
        for(int x:nums)
        {
            for(int i=ts;i>=x;i--)
            {
                dp[i]=dp[i]||dp[i-x];
                if(dp[ts])
                return true;
            }
        }
        return dp[ts];
    }
}