//Robot return to origin(LC 657)
//character array & move accordingly

package GoldmanSachs.Med;

class p26{
    public boolean judgeCircle(String moves) {
        char arr[]=moves.toCharArray();
        int n=arr.length;
        int x=0,y=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]=='R')
            x++;
            else if(arr[i]=='L')
            x--;
            else if(arr[i]=='U')
            y++;
            else
            y--;
        }
        if(x==0 && y==0)
        return true;
        return false;
    }
}