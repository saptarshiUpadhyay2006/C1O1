//Sum of Sq no.s(LC 633)
//Optimal---------T.C:O(rootc)------S.C:O(1)
//USING THE LC TEMPLATE
package Adobe.Medium;
import java.util.*;

class p2{
    public boolean judgeSquareSum(int c) {
        if(c<0)
        return false;

        long l=0,r=(long)Math.sqrt(c);
        while(l<=r)
        {
            long s=l*l+r*r;
            if(s==c)
            return true;
            else if(s<c)
            l++;
            else
            r--;
        }
        return false;
    }
}