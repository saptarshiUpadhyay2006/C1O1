//Longest palindrome substring(LC 5)
//Ptr approach

package DEShaw.Medium;

class p41{
    public String longestPalindrome(String s) {
        int st=0,e=1,l=0,r=0;
        for(int i=0;i<s.length();i++)
        {
            l=i;
            r=i;
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r))
            {
                if(r-l+1>e)
                {
                    st=l;
                    e=r-l+1;
                }
                l--;
                r++;
            }
            l=i;
            r=i+1;
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r))
            {
                if(r-l+1>e)
                {
                    st=l;
                    e=r-l+1;
                }
                l--;
                r++;
            }
        }
        return s.substring(st,st+e);
    }
}