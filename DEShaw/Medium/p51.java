//Longest Substring Without Repeating Characters(LC 3)
//using HashSet

package DEShaw.Medium;
import java.util.*;
class p51{
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