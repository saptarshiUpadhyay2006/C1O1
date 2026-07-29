//Basic cal II(LC 227)
//using stack

package GoldmanSachs.Med;
import java.util.*;
class p191{
    public int calculate(String s) {
        if(s==null||s.isEmpty())
        return 0;
        int l=s.length();
        Stack<Integer> st=new Stack<Integer>();
        int c=0;
        char op='+';
        for(int i=0;i<l;i++)
        {
            char ch=s.charAt(i);
            if(Character.isDigit(ch))
            c=(c*10)+(ch-'0');

            if(!Character.isDigit(ch)&&(!Character.isWhitespace(ch))||i==l-1)
            {
                if(op=='-')
                st.push(-c);
                else if(op=='+')
                st.push(c);
                else if(op=='*')
                st.push(st.pop()*c);
                else if(op=='/')
                st.push(st.pop()/c);

                op=ch;
                c=0;
            }
        }
        int r=0;
        while(!st.isEmpty())
        r+=st.pop();
        return r;

    }
}