//Valid Parentheses(LC 20)
//using a stack DS

package GoldmanSachs.Med;
import java.util.*;
class p72{
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray())
        {
            if(ch=='(')
            st.push(')');
            else if(ch=='{')
            st.push('}');
            else if(ch=='[')
            st.push(']');
            else
            {
                if(st.isEmpty()||st.pop()!=ch)
                return false;
            }
        }
        return st.isEmpty();
    }
}