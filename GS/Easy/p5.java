//Robot Return to Origin(LC 657)
//Brute force & Optimal Approach----inc & dec x 7 y coordn--T.C:O(n)------S.C:O(1)
//USING THE LC TEMPLATE

package GS.Easy;

class p5{
    public boolean judgeCircle(String moves) {
        int n=moves.length();
        int x=0,y=0;
        for(int i=0;i<n;i++)
        {
            if(moves.charAt(i)=='U')
            y++;
            else if(moves.charAt(i)=='D')
            y--;
            else if(moves.charAt(i)=='L')
            x--;
            else
            x++;
        }
        if(x==0 && y==0)
        return true;

        return false;
    }
}