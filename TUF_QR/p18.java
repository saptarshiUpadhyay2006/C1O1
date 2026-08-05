package TUF_QR;
import java.util.*;
class p18{
    public int kDistinctChar(String s, int k) {
        //your code goes here
        int n=s.length();
        int ml=0;
        HashMap<Character,Integer> mp=new HashMap<>();
        int l=0,r=0;
        while(r<n)
        {
            char cr=s.charAt(r);
            mp.put(cr,mp.getOrDefault(cr,0)+1);
            if(mp.size()>k)
            {
                char cl=s.charAt(l);
                mp.put(cl,mp.get(cl)-1);
                if(mp.get(cl)==0)
                mp.remove(cl);

                l++;
            }
            if(mp.size()<=k)
            ml=Math.max(ml,r-l+1);

            r++;
        }
        return ml;
    }
}