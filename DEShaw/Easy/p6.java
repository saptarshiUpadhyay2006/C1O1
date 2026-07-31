//Minimum Number of Chairs in a Waiting Room(LC 3168)
//Check and count

package DEShaw.Easy;

class p6{
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