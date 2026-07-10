//Determine if 2 strings are close(LC 1657)
//Optimal-----HashSet----T.C:O(n)------S.C:O(1)
//USING THE LC TEMPLATE
package Google.Medium;
import java.util.*;

class p9{
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length())
        return false;

        int a[]=new int[26];
        int b[]=new int[26];
        for(int i=0;i<word1.length();i++)
        a[word1.charAt(i)-'a']++;
        for(int i=0;i<word2.length();i++)
        b[word2.charAt(i)-'a']++;

        for(int i=0;i<26;i++)
        {
            if((a[i]==0 && b[i]!=0)||(a[i])!=0 && b[i]==0)
            return false;
        }
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b);
    }
}