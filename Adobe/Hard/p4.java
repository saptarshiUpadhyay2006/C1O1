//Palindrome partitioning II(LC 132)
//Optimal----Use DP-----T.C:O(n^2)------S.C:O(n^2)
//USING THE LC TEMPLATE

package Adobe.Hard;
import java.util.*;

class Solution {
    public int minCut(String s) {
        int n=s.length();
        boolean pal[][]=new boolean[n][n];
        for(int i=n-1;i>=0;i--){
            for(int j=i;j<n;j++){
                if(s.charAt(i)==s.charAt(j) && (j-i<=2||pal[i+1][j-1])){
                  pal[i][j]=true;
                }
            }
        }
        int dp[]=new int[n + 1];
        dp[n]=0;
        for(int i=n-1;i>=0;i--){
            int mini=Integer.MAX_VALUE;
            for(int j=i;j<n;j++){
                if(pal[i][j]){
                    mini=Math.min(mini,1+dp[j+1]);
                }
            }
            dp[i]=mini;
        }
        return dp[0]-1;
    }
}