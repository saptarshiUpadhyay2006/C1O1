//No of ways to assign different hats to different people(LC 1434)
//DP+Bitmasking

package DEShaw.Hard;
import java.util.*;
class p23{
    int mod=1000000007;
    int dp[][];
    int t;
    public int numberWays(List<List<Integer>> hats) {
        dp=new int[41][(1<<(hats.size()+1))-1];
        List<Integer> arr[]=new List[41];
        t=hats.size();
        for(int i=0;i<=40;i++){
            arr[i]=new ArrayList<>();
        }
        for(int i=0;i<hats.size();i++){
            for(int j=0;j<hats.get(i).size();j++){
                arr[hats.get(i).get(j)].add(i);
            }
        }
        for(int i=0 ; i<dp.length ; i++){
            for(int j=0 ; j<dp[0].length ; j++){
                dp[i][j] = -1;
            }
        }
        return fac(arr,0, 0, 0);
    }
    int fac(List<Integer>[] arr, int bitmask, int n, int placed){
        if(placed==t) 
        return 1;
        if(n== 41){
            return 0;
        }
        if(dp[n][bitmask]!=-1) 
        return dp[n][bitmask];
        int count=fac(arr,bitmask,n+1,placed)%mod;
        for(int i=0;i<arr[n].size();i++){
            int x=arr[n].get(i);
            if((bitmask&(1<<x))!=0) 
            continue;
            count=(count+fac(arr,(bitmask|(1<<x)),n+1,placed+1)%mod)%mod;
        }
        return dp[n][bitmask]=count;
    }
}