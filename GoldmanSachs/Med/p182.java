//Restore IP Addresses(LC 93)


package GoldmanSachs.Med;
import java.util.*;
class p182{
    List<String> arr=new ArrayList<>();
    String str;
    public List<String> restoreIpAddresses(String s) {
        str=s;
        fac("",0,0);
        return arr;
    }
    public void fac(String p,int idx,int d)
    {
        if(d>4)
        return;
        if(d==4 && idx>=str.length())
        {
            arr.add(p.substring(0,p.length()-1));
            return;
        }
        for(int l=1;l<=3 && idx+l<=str.length();l++)
        {
            String n=str.substring(idx,idx+l);
            if(n.charAt(0)=='0' && l!=1)
            break;
            else if(Integer.parseInt(n)<=255)
            fac(p+str.substring(idx,idx+l)+".",idx+l,d+1);
        }
    }
}
