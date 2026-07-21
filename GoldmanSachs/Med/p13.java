//Robot bounded in a circle(LC 1041)
//just keep track of dirn and move accrdly iteration-wise

package GoldmanSachs.Med;

class p13{
    public boolean isRobotBounded(String instructions) {
        int x=0,y=0;
        char d='N';
        for(char ch:instructions.toCharArray())
        {
            if(ch=='G')
            {
                if(d=='N')
                y++;
                else if(d=='S')
                y--;
                else if(d=='W')
                x--;
                else
                x++;
            }
            else if(ch=='L')
            {
                if(d=='N')
                d='W';
                else if(d=='W')
                d='S';
                else if(d=='S')
                d='E';
                else
                d='N';
            }
            else
            {
                if(d=='N')
                d='E';
                else if(d=='W')
                d='N';
                else if(d=='S')
                d='W';
                else
                d='S';
            }
        }
        if(x==0 && y==0||d!='N')
        return true;

        return false;
    }
}