//Longest valid parentheses(LC 32)
//Optimal Approach----T.C:O(n)------S.C:O(n)
//USING THE LC TEMPLATE

package Amazon.Hard;
import java.util.*;
class p5{
    public int longestValidParentheses(String s) {
        int n=s.length();
        Stack<Integer> st=new Stack<>();
        st.push(-1);
        int res=0;
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='(')
            st.push(i);
            else
            {
                if(!st.empty())
                st.pop();
                if(!st.empty())
                res=Math.max(res,i-st.peek());
                else
                st.push(i);
            }
        }
        return res;
    }
}