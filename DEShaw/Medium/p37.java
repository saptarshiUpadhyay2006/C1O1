//Longest repeating character replacement(LC 424)
//ptr approach

package DEShaw.Medium;

class p37{
    public int characterReplacement(String s, int k) {
        int maxi=0;
        int n=s.length();
        for(char ch='A';ch<='Z';ch++)
        {
            int i=0,j=0,r=0;
            while(j<n)
            {
                if(s.charAt(j)==ch)
                j++;
                else if(r<k)
                {
                    j++;
                    r++;
                }
                else if(s.charAt(i)==ch)
                i++;
                else
                {
                    i++;
                    r--;
                }
                maxi=Math.max(maxi,j-i);
            }
        }
        return maxi;
    }
}