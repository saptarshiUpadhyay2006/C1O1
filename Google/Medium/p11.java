//String to Integer(LC 8)
//Optimal----T.C:O(n)------S.C:O(1)
//USING THE LC TEMPLATE
package Google.Medium;
import java.util.*;

class p11{
    public int myAtoi(String s) {
        int i=0,res=0,sign=1;
        while(i<s.length() && s.charAt(i)==' ')
        i++;
        if(i==s.length())
        return 0;
        if(s.charAt(i)=='-')
        {
            sign=-1;
            i++;
        }
        else if(s.charAt(i)=='+')
        i++;
        
        while(i<s.length() && Character.isDigit(s.charAt(i)))
        {
            int n=s.charAt(i)-'0';
            i++;
            if(res>Integer.MAX_VALUE/10||(res==Integer.MAX_VALUE/10 && n>Integer.MAX_VALUE%10))
            {
                if(sign==-1)
                return Integer.MIN_VALUE;
                else
                return Integer.MAX_VALUE;
            }
            res=res*10+n;
        }
        return sign*res;
    }
}