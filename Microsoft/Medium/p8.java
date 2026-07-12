//Longest Substring without repeating characters(LC 3)
//Optimal------T.C:O(n)------S.C:O(n)
//USING THE LC TEMPLATE

package Microsoft.Medium;
import java.util.*;

class p8{
    public int lengthOfLongestSubstring(String s) {
        int fq[]=new int[256];
        Arrays.fill(fq,0);
        int n=s.length(),i=0,j=0,sm=0;

        while(i<n)
        {
            if(fq[s.charAt(i)]==1)
            {
                while(fq[s.charAt(i)]==1)
                {
                    fq[s.charAt(j)]--;
                    j++;
                }
            }
            fq[s.charAt(i)]++;
            sm=Math.max(sm,i-j+1);
            i++;
        }
        return sm;
    }
}