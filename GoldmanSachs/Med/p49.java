//Minimum Number of Chairs in a Waiting Room(LC 3168)

package GoldmanSachs.Med;

class p49{
    public int minimumChairs(String s) {
        int c=0,maxi=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='E')
            c++;
            else
            c--;
            maxi=Math.max(c,maxi);
        }
        return maxi;
    }
}