//Maxm pts tourist can earn(LC 3332)
//Optimal--------T.C:O(n^2)------S.C:O(n)
//USING THE LC TEMPLATE

package DEShaw.Medium;
import java.util.*;
class Solution {
    int dp[][];

    public int maxScore(int n, int k, int[][] stayScore, int[][] travelScore) {
        dp = new int[k+1][n+1];
        Arrays.stream(dp).forEach(row -> Arrays.fill(row, -1));
        int s=0;
        for(int i=0;i<n;++i){
            s=Math.max(s,solve(n,k,0,i,stayScore,travelScore));
        }
    
        return s;
    }
    int solve(int n,int k,int day,int curCity,int[][] stayScore,int[][] travelScore){
        if(day>=k) 
        return 0;
        if(dp[day][curCity]!=-1) 
        return dp[day][curCity];
        int maxi=stayScore[day][curCity]+solve(n,k,day+1,curCity,stayScore,travelScore);
        for(int j=0;j<n;++j){
            if(j==curCity) 
            continue;
            maxi=Math.max(maxi,travelScore[curCity][j]+solve(n,k,day+1,j,stayScore,travelScore));
        }
        return dp[day][curCity]=maxi;
    }
}