//Query Kth Smallest Trimmed Number(LC 2343)
//Substring compare

package DEShaw.Medium;
import java.util.*;
class p21{
    public int[] smallestTrimmedNumbers(String[] nums, int[][] queries) {
        int n=nums.length;
        int res[]=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int k=queries[i][0];
            int trim=queries[i][1];
            Integer idx[]=new Integer[n];
            for(int j=0;j<n;j++) 
            idx[j]=j;
            Arrays.sort(idx,(a,b)->{
                String s1=nums[a].substring(nums[a].length()-trim);
                String s2=nums[b].substring(nums[b].length()-trim); 
                int cmp=s1.compareTo(s2);
                if(cmp==0) 
                return a - b; 
                return cmp;
            });
            res[i]=idx[k-1];
        }
        return res;
    }
}