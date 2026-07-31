//Removing minm no of magic beans(LC 2171)
//mini traversal

package DEShaw.Medium;
import java.util.*;
class p19{
    public long minimumRemoval(int[] beans) {
        Arrays.sort(beans);
        long sm=0;
        for(int i:beans) {
            sm+=i;
        }
        long mini=Long.MAX_VALUE;
        long m=beans.length;
        for(int i=0;i<beans.length;i++,m--) {
            mini=Math.min(mini,sm-m*beans[i]);
        }
        return mini;
    }
}