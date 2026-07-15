//Maxm profit in Job scheduling(LC 1817)
//Optimal---------T.C:O(nlogn)------S.C:O(n)
//USING THE LC TEMPLATE

package Atlassian.Hard;
import java.util.*;
class Solution {
    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n=startTime.length;
        List<List<Integer>> arr=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            ArrayList<Integer> l=new ArrayList<>();
            l.add(startTime[i]);
            l.add(endTime[i]);
            l.add(profit[i]);
            arr.add(l);
        }
        Collections.sort(arr,(List<Integer> a,List<Integer> b)->{
            return a.get(1).compareTo(b.get(1));
        });
        int dp[]=new int[n];
        dp[0]=arr.get(0).get(2);

        for(int i=1;i<n;i++)
        {
            int s=0,e=i-1,res=-1;
            while(s<=e)
            {
                int m=(s+e)/2;
                if(arr.get(m).get(1)<=arr.get(i).get(0))
                {
                    res=m;
                    s=m+1;
                }
                else
                e=m-1;
            }
            if(res==-1)
            dp[i]=Math.max(dp[i-1],arr.get(i).get(2));
            else
            dp[i]=Math.max(dp[i-1],arr.get(i).get(2)+dp[res]);
        }
        return dp[n-1];
    }
}