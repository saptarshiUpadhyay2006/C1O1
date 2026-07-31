//String to integer(Atoi)(LC 8)
//checking

package DEShaw.Medium;

class p44{
    public int myAtoi(String s) {
        int i=0,rs=0,sn=1;
        while(i<s.length() && s.charAt(i)==' ')
        i++;
        if(i==s.length())
        return 0;
        if(s.charAt(i)=='-')
        {
            sn=-1;
            i++;
        }
        else if(s.charAt(i)=='+')
        i++;
        
        while(i<s.length() && Character.isDigit(s.charAt(i)))
        {
            int n=s.charAt(i)-'0';
            i++;
            if(rs>Integer.MAX_VALUE/10||(rs==Integer.MAX_VALUE/10 && n>Integer.MAX_VALUE%10))
            {
                if(sn==-1)
                return Integer.MIN_VALUE;
                else
                return Integer.MAX_VALUE;
            }
            rs=rs*10+n;
        }
        return sn*rs;
    }
}