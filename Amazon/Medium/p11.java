//Longest Palindrome Substring(LC 5)
//Optimal Approach----T.C:O(n^2)------S.C:O(1)
//USING THE LC TEMPLATE
package Amazon.Medium;

class p11{
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