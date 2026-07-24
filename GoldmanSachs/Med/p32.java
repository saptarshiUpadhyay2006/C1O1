//Minm cost of a homecoming in a grid(LC 2087)
//moving from row & col in a greedy way

package GoldmanSachs.Med;

class p32{
    public int minCost(int[] startPos, int[] homePos, int[] rowCosts, int[] colCosts) {
        int res=0;
        int r1=startPos[0],c1=startPos[1],r2=homePos[0],c2=homePos[1];

        if(r2>=r1)
        {
            for(int i=r1+1;i<=r2;i++)
            res+=rowCosts[i];
        }
        else
        {
            for(int i=r2;i<r1;i++)
            res+=rowCosts[i];
        }
        if(c2>=c1)
        {
            for(int i=c1+1;i<=c2;i++)
            res+=colCosts[i];
        }
        else
        {
            for(int i=c2;i<c1;i++)
            res+=colCosts[i];
        }

        return res;
    }
}