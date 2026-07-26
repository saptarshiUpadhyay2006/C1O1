//Backspace String Compare(LC 844)

package GoldmanSachs.Med;
import java.util.*;
class Solution {
    public boolean backspaceCompare(String s, String t) {
        int n1=s.length(),n2=t.length();
        Stack<Character> st=new Stack<>();
        Stack<Character> tt=new Stack<>();
        for(int i=0;i<n1;i++)
        {
            char ch=s.charAt(i);
            if(ch=='#')
            {
                if(!st.isEmpty())
                st.pop();
            }
            else
            st.push(ch);
        }
        for(int i=0;i<n2;i++)
        {
            char ch=t.charAt(i);
            if(ch=='#')
            {
                if(!tt.isEmpty())
                tt.pop();
            }
            else
            tt.push(ch);
        }
        StringBuilder r1=new StringBuilder();
        StringBuilder r2=new StringBuilder();
        while(!st.isEmpty()){
            r1.append(st.pop());
        }

        while(!tt.isEmpty()){
            r2.append(tt.pop());
        }
        return r1.toString().equals(r2.toString());
    }
}