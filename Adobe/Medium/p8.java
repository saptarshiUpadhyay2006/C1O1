//Minm no of swaps to make string balanced(LC 1963)
//Optimal-----((no of mismatch)+1)/2------T.C:O(n)------S.C:O(1)
//USING THE LC TEMPLATE
package Adobe.Medium;
import java.util.*;

class p8{
    public int minSwaps(String s) {
        int ms=0;
        for(char ch:s.toCharArray())
        {
            if(ch=='[')
            ms++;
            else if(ms>0)
            ms--;
        }
        return (ms+1)/2;
    }
}