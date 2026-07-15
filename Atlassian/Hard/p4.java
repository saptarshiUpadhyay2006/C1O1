//No of ways to form a target string given a dictionary(LC 1639)
//Optimal--------T.C:O(n.m)------S.C:O(n+m)
//USING THE LC TEMPLATE

package Atlassian.Hard;

class p4{
    public int numWays(String[] words, String target) {
        int n=words[0].length();
        int m=target.length();
        int MOD=1000000007;
        int dp[]=new int[m+1];
        dp[0]=1;
        int arr[][]=new int[n][26];
        for(String word:words) {
            for(int i=0;i<n;i++){
                arr[i][word.charAt(i)-'a']++;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=m-1;j>=0;j--){
                dp[j+1]+=(int)((long)dp[j]*arr[i][target.charAt(j) - 'a'] % MOD);
                dp[j+1]%=MOD;
            }
        }
        return dp[m];
    }
}