//Decode ways(LC 91)
//use character.getNumericValue & Integer.parseInt---perform DP on it.

package GoldmanSachs.Med;

class p16{
    public int numDecodings(String s) {
        if(s.charAt(0)=='0')
        return 0;

        int n=s.length();
        int dp[]=new int[n+1];
        dp[0]=dp[1]=1;

        for(int i=2;i<=n;i++)
        {
            int o=Character.getNumericValue(s.charAt(i-1));
            int t=Integer.parseInt(s.substring(i-2,i));
            if(1<=o && o<=9)
            dp[i]+=dp[i-1];

            if(10<=t && t<=26)
            dp[i]+=dp[i-2];
        }
        return dp[n];
    }
}