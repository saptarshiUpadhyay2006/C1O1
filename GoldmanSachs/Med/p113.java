//Russian Doll Envelope
//Using a dp approach & comparator use

package GoldmanSachs.Med;
import java.util.*;
class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        if(envelopes==null||envelopes.length==0||envelopes[0]==null||envelopes[0].length!=2)
        return 0;
        Arrays.sort(envelopes,new Comparator<int[]>(){
            public int compare(int[] arr1,int[] arr2){
                if(arr1[0]==arr2[0])
                    return arr2[1]-arr1[1];
                else
                    return arr1[0]-arr2[0];
        } 
        });
        int dp[]=new int[envelopes.length];
        int l=0;
        for(int[] envelope:envelopes){
            int idx=Arrays.binarySearch(dp, 0, l, envelope[1]);
            if(idx<0)
                idx=-(idx + 1);
            dp[idx]=envelope[1];
            if(idx==l)
                l++;
        }
        return l;
    }
}