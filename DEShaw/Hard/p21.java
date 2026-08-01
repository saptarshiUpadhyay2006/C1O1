//Longest valid parentheses(LC 32)
//stack based approach----T.C:O(n)------S.C:O(n)

package DEShaw.Hard;
import java.util.*;
class p21{
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