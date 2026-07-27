//Consecutive Characters(LC 1446)
//comparing approach

package GoldmanSachs.Med;

class p81{
    public int maxPower(String s) {
       int n=s.length();
       int c=1,maxi=1;
       for(int i=1;i<n;i++)
        {
            if(s.charAt(i)==s.charAt(i-1))
            c++;
            else
            {
                maxi=Math.max(c,maxi);
                c=1;
            }
        }
        maxi=Math.max(c,maxi);
        return maxi;
    }
}