//Longest Common sequence(LC 128)
//Optimal----Use sets-----T.C:O(n)------S.C:O(n)
//USING THE LC TEMPLATE
package Google.Easy;
import java.util.*;
class p3{
    public int longestConsecutive(int[] nums) {
        Set<Integer> st=new HashSet<>();
        for(int n:nums)
        st.add(n);
        int s=0;
        for(int i:st)
        {
            if(!st.contains(i-1))
            {
                int l=1;
                while(st.contains(i+l))
                l++;
                s=Math.max(l,s);
            }
        }
        return s;
    }
}