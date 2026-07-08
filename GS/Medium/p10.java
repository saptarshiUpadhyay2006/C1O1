//Longest word in dictionary through deleting(LC 524)
//Optimal Soln-----subseq check & cal max-----T.C:O(n)------S.C:O(n)
//USING THE LC TEMPLATE
package GS.Medium;
import java.util.*;

class p10{
    public String findLongestWord(String s, List<String> dictionary) {
        String maxi="";
        for(String str:dictionary)
        {
            if(fac(str,s))
            {
                if(str.length()>maxi.length()||(str.length()==maxi.length() && str.compareTo(maxi)<0))
                maxi=str;
            }
        }
        return maxi;
    }
    private static boolean fac(String x,String y)
    {
        int j=0;
        for(int i=0;i<y.length() && j<x.length();i++)
        {
            if(x.charAt(j)==y.charAt(i))
            j++;
        }
        return j==x.length();
    }
}