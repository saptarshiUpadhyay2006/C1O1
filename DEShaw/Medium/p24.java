//Using a Robot to Print the Lexicographically Smallest String(LC 2434)
//stack approach

package DEShaw.Medium;
import java.util.*;
class p24{
    public String robotWithString(String s) {
        int n=s.length();
        char mini[]=new char[n];
        mini[n-1]=s.charAt(n-1);
        for(int i=n-2;i>=0;i--){
            mini[i]=(char)Math.min(s.charAt(i),mini[i+1]);
        }
        StringBuilder p=new StringBuilder();
        Stack<Character> t=new Stack<>();
        for(int i=0;i<n;i++){
            t.push(s.charAt(i));
            while(!t.isEmpty()&&(i==n-1||t.peek()<=mini[i + 1])) 
            {
                p.append(t.pop());
            }
        }
        return p.toString();
    }
}