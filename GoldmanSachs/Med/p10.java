//Longest substring without repeating characters(LC 3)
//Using a hashset & check the stack accordingly & update max

package GoldmanSachs.Med;
import java.util.*;
class p10{
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs=new HashSet<>();
        int l=0,maxi=0;
        for(int r=0;r<s.length();r++)
        {
            while(hs.contains(s.charAt(r)))
            {
                hs.remove(s.charAt(l));
                l++;
            }
            hs.add(s.charAt(r));
            maxi=Math.max(maxi,r-l+1);
        }
        return maxi;
    }
}