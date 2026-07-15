//Shortest superstring(LC 84)
//Optimal Approach----T.C:O(n)------S.C:O(n)
//USING THE LC TEMPLATE

package Google.Hard;
import java.util.*;
class p3{
    public String shortestSuperstring(String[] words) {
        int n=words.length;
        int mat[][]=new int[n][n];
        for(int i=0;i<n;i++) 
            for(int j=i+1;j<n;j++){
                mat[i][j]=fac(words[i], words[j]);
                mat[j][i]=fac(words[j], words[i]);
            }
        int dp[][]=new int[1<<n][n];
        for(int row[]:dp)
             Arrays.fill(row,Integer.MAX_VALUE/2);
        int arr[][]=new int[1<<n][n];
        for(int row[]:arr) 
            Arrays.fill(row, -1);
        for(int i=0;i<n;i++) 
            dp[1<<i][i]=words[i].length();
        int mini=Integer.MAX_VALUE;
        int cur=0;
        for(int s=1;s<(1<<n);s++){
            for(int i=0;i<n;i++){
                if((s&(1<<i))==0) 
                continue;
                int ps=s&~(1<<i);
                for(int j=0;j<n;j++){
                    if(dp[ps][j]+mat[j][i]<dp[s][i]){
                        dp[s][i]=dp[ps][j]+mat[j][i];
                        arr[s][i]=j;
                    }
                }
                if(s==(1<<n) -1&&dp[s][i]<mini){
                    mini=dp[s][i];
                    cur=i;
                }   
            } 
        }
        int s=(1<<n)-1;
        String sb= "";
        while(s>0){
            int prev=arr[s][cur];
            if(prev<0) 
            sb=words[cur]+sb;
            else 
            sb=words[cur].substring(words[cur].length()-mat[prev][cur])+ sb;
            s&=~(1<<cur);
            cur=prev;
        }
        return sb;
    }
    private int fac(String a, String b) {
        int d=b.length();
        for(int k=1;k<=Math.min(a.length(),b.length());k++){
            if(a.endsWith(b.substring(0, k)))
                d=b.length()-k;
        }
        return d;
    }
}