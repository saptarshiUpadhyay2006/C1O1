package TUF_QR;
import java.util.*;
class p42{
    public List<Integer> search(String pat, String txt) {
        int n=pat.length();
        int m=txt.length();
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<=m-n;i++)
        {
            boolean f=true;
            for(int j=0;j<n;j++)
            {
                if(txt.charAt(i+j)!=pat.charAt(j))
                {
                    f=false;
                    break;
                }
            }
            if (f)
            arr.add(i);
        }
        return arr;
    }
}
