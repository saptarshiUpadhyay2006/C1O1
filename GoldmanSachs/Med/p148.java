//132 pattern(LC 456)
//using a stack DS

package GoldmanSachs.Med;
import java.util.*;
class Solution {
    public boolean find132pattern(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int maxi=Integer.MIN_VALUE;

        for(int i=nums.length-1;i>=0;i--)
        {
            if(nums[i]<maxi)
            return true;
            while(!st.isEmpty() && st.peek()<nums[i])
            maxi=st.pop();

            st.push(nums[i]);
        }
        return false;
    }
}