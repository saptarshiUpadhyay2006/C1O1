//Minm length of String after deleting similar ends(LC 1750)
//Using a peeling technique

package GoldmanSachs.Med;

class Solution {
    public int minimumLength(String s) {
        int i=0,j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            break;

            if(s.charAt(i)==s.charAt(j))
            {
                char ch=s.charAt(i);
                while(i<=j && s.charAt(i)==ch)
                i++;
                while(j>=i && s.charAt(j)==ch)
                j--;
            }
        }
        return j-i+1;
    }
}