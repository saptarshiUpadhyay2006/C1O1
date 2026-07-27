//LCS(LC 128)
//Using set DS

package GoldmanSachs.Med;
import java.util.*;
class p96{
    public int longestConsecutive(int[] nums) {
        Set<Integer> st=new HashSet<>();
        for(int x:nums)
        st.add(x);

        int maxi=0;
        for(int i:st)
        {
            if(!st.contains(i-1))
            {
                int l=1;
                while(st.contains(i+l))
                l++;
                maxi=Math.max(maxi,l);
            }
        }
        return maxi;
    }
}