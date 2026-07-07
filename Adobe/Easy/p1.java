//Baseball Game(LC 682)
//Optimal Approach---Basic iterations----T.C:O(n)------S.C:O(n)
//USING THE LC TEMPLATE

package Adobe.Easy;

import java.util.*;
class p1{
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        int e1=0,e2=0;
        for(String ch:operations)
        {
            if(ch.equals("+"))
            {
                e1=(int)st.pop();
                e2=(int)st.pop();
                st.push(e2);
                st.push(e1);
                st.push(e1+e2);
            }
            else if(ch.equals("D"))
            {
                st.push(2*st.peek());
            }
            else if(ch.equals("C"))
            {
                st.pop();
            }
            else
            st.push(Integer.parseInt(ch));
        }
        int s=0;
        while(!st.isEmpty())
        {
            s+=(int)st.pop();
        }
        return s;
    }
}