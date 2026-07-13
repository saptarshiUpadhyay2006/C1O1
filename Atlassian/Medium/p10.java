//Maxm no of occurences of a substring(LC 1297)
//Optimal----Comparing the 2maps-----T.C:O(n)------S.C:O(n)
//USING THE LC TEMPLATE

package Atlassian.Medium;
import java.util.*;


class p10{
    public int maxFreq(String s, int maxLetters, int minSize, int maxSize) {
        int n=s.length();
        Map<Character,Integer> mp1=new HashMap<>();
        Map<String,Integer> mp2=new HashMap<>();
        int res=0;
        for(int i=0;i<minSize;i++)
        {
            char c=s.charAt(i);
            int c1=mp1.getOrDefault(c,0)+1;
            mp1.put(c,c1);
        }
        String t=s.substring(0,minSize);
        if(mp1.size()<=maxLetters)
        {
            mp2.put(t,1);
            res=1;
        }
        for(int i=minSize;i<n;i++)
        {
            char c=s.charAt(i),rc=s.charAt(i-minSize);
            int c1=mp1.getOrDefault(c,0)+1;
            mp1.put(c,c1);
            if(mp1.get(rc)==1)
            mp1.remove(rc);
            else
            mp1.put(rc,mp1.get(rc)-1);

            if(mp1.size()<=maxLetters)
            {
                t=s.substring(i-minSize+1,i+1);
                int c2=mp2.getOrDefault(t,0)+1;
                mp2.put(t,c2);
                res=Math.max(res,c2);
            }
        }
        return res;
        
    }
}