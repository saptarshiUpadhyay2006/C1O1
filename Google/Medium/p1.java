//Palindrome Partitioning(LC 131)
//Optimal---Backtracking with DP----T.C:O(n · 2ⁿ)------S.C:O(n² + n · 2ⁿ)
//USING THE LC TEMPLATE
package Google.Medium;
import java.util.*;

class Solution {
    List<List<String>> res;
    public List<List<String>> partition(String s) {
        int l=s.length();
        res=new ArrayList<>();
        int dp[][]=new int[l+1][l+1];
        rec(new ArrayList<>(),0,s,dp);
        return res;
    }
    private void rec(List<String> curr,int i,String s,int dp[][])
    {
        if(s.length()==i)
        {
            res.add(curr);
            return;
        }
        if(i>s.length())
        return;

        for(int j=i;j<s.length();j++)
        {
            String d=s.substring(i,j+1);
            if(dp[i][j]==1||isPal(d,dp))
            {
                dp[i][j]=1;
                List<String> c=new ArrayList<>(curr);
                c.add(d);
                rec(c,j+1,s,dp);
            }
        }
    }
    public boolean isPal(String s,int dp[][])
    {
        int st=0,e=s.length()-1;
        while(st<e)
        {
            if(s.charAt(st)!=s.charAt(e))
            return false;
            if(dp[st][e]==1)
            return true;
            st++;
            e--;
        }
        return true;
    }
}