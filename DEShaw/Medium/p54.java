//Remove Duplicate Letters(LC 316)
//Stack + Greedy

package DEShaw.Medium;
import java.util.*;
class p54{
    public String removeDuplicateLetters(String s) {
        Map<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<s.length();i++)
        mp.put(s.charAt(i),i);

        Stack<Character> st=new Stack<>();
        Set<Character> vis=new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            if(vis.contains(s.charAt(i)))
            continue;

            while(!st.isEmpty() && s.charAt(i)<st.peek() && i<mp.getOrDefault(st.peek(),-1))
            vis.remove(st.pop());

            vis.add(s.charAt(i));
            st.push(s.charAt(i));
        }
        StringBuilder sb=new StringBuilder();
        for(char ch:st)
        sb.append(ch);

        return sb.toString();
    }
}