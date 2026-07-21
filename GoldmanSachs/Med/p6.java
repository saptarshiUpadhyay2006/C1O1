//fraction to recurring decimal(LC 166)
//using long division 

package GoldmanSachs.Med;
import java.util.*;

class p6{
    public String fractionToDecimal(int numerator, int denominator) {
        if(numerator==0)
        return "0";
        StringBuilder sb=new StringBuilder();
        sb.append(((numerator>0)^(denominator>0))?"-":"");

        long n=Math.abs((long)numerator);
        long d=Math.abs((long)denominator);
        sb.append(n/d);
        n%=d;
        if(n==0)
        return sb.toString();
        sb.append(".");
        HashMap<Long,Integer> mp=new HashMap<Long,Integer>();
        mp.put(n,sb.length());
        while(n!=0)
        {
            n*=10;
            sb.append(n/d);
            n%=d;
            if(mp.containsKey(n))
            {
                int idx=mp.get(n);
                sb.insert(idx,"(");
                sb.append(")");
                break;
            }
            else
            mp.put(n,sb.length());
        }
        return sb.toString();
    }
}