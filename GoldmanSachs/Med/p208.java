//Find original array from doubled array(LC 2007)
//Map DS

package GoldmanSachs.Med;
import java.util.*;
class p208{
    public int[] findOriginalArray(int[] changed) {
        int n=changed.length,i=0;
        if(n%2==1) 
        return new int[0];
        int res[]=new int[n / 2];
        Map<Integer,Integer> mp=new TreeMap<>();
        for(int a:changed)
            mp.put(a,mp.getOrDefault(a,0)+1);
        for(int x : mp.keySet()) {
            if (mp.get(x)>mp.getOrDefault(x+x,0))
                return new int[0];
            for(int j=0;j<mp.get(x);++j){
                res[i++]=x;
                mp.put(x+x,mp.get(x+x)-1);
            }
        }
        return res;
    }
}