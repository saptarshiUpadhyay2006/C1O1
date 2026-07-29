//Evaluate reverse polish notation(LC 150)


package GoldmanSachs.Med;
import java.util.*;
class p204{
    public int evalRPN(String[] tokens) {
           Stack<Integer> st=new Stack<>();
           for(String s:tokens)
           {
            if(s.equals("+"))
            st.push(st.pop()+st.pop());
            else if(s.equals("-"))
            {
                int se=st.pop();
                int fr=st.pop();
                st.push(fr-se);
            }
            else if(s.equals("*"))
            st.push(st.pop()*st.pop());
            else if(s.equals("/"))
            {
                int se=st.pop();
                int f=st.pop();
                st.push(f/se);
            }
            else
            st.push(Integer.parseInt(s));
           }
           return st.peek();
    }
}