//Palindrome substrings(LC 647)
//using a helper fn

package GoldmanSachs.Med;

class p57{
    public int countSubstrings(String s) {
        int n=s.length();
        int c=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                String sub=s.substring(i,j+1);
                if(pal(sub))
                c++;
            }
        }
        return c;
    }
    private boolean pal(String sb)
    {
        int l=0,r=sb.length()-1;
        while(l<r)
        {
            if(sb.charAt(l)!=sb.charAt(r))
            return false;

            l++;
            r--;
        }
        return true;
    }
}