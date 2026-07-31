//Maximize Palindrome Length From Subsequences(LC 1771)
//DP

package DEShaw.Hard;

class p12{
    public int longestPalindrome(String word1, String word2) {
        String s=word1+word2;
        int m=word1.length(),n=s.length();
        int arr[]={0};
        fac(s.toCharArray(),0,n-1,m,new Integer[n][n],arr);
        return arr[0];
    }
    private int fac(char s[],int i,int j,int m,Integer dp[][],int arr[])
    {
        if(i>j){
            return 0;
        } 
        else if(i==j){
            return 1;
        } 
        else if(null!=dp[i][j]){
            return dp[i][j];
        } 
        else if(s[i]==s[j])
        {
            dp[i][j]=fac(s,i+1,j-1,m,dp,arr)+2;
            if(i<m&&j>=m){
                arr[0]=Math.max(arr[0],dp[i][j]);
            }
        } 
        else 
        {
            dp[i][j]=Math.max(fac(s,i+1,j,m,dp,arr),fac(s,i,j-1,m,dp,arr));
        }
        return dp[i][j];
    }
}