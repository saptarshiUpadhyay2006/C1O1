//Keep multiplying found values by two(LC 2154)
//Use a Set DS and run a while loop

package GoldmanSachs.Med;
import java.util.*;

class p38{
    public int findFinalValue(int[] nums, int original) {
       Set<Integer> ns=new HashSet<>();
       for(int x:nums)
       ns.add(x);

       while(ns.contains(original))
       original*=2;

       return original;
    }
}