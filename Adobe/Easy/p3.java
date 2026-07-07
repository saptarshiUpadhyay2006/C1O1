//To Lower Case(LC 709)
//Optimal Approach---ASCII hunt----T.C:O(n)------S.C:O(n)
//USING THE LC TEMPLATE

package Adobe.Easy;

import java.util.*;
class p3{
    public String toLowerCase(String s) {
        int n=s.length();
        char ch[]=s.toCharArray();
        for(int i=0;i<n;i++)
        {
            if(ch[i]>=65 && ch[i]<=90)
            {
                ch[i]=(char)(ch[i]+32);
            }

        }
        return new String(ch);
    }
}
