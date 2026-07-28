//Koko eating bananas(LC 875)
//Using binary search within the low & high

package GoldmanSachs.Med;
import java.util.*;
class p875{
    public int minEatingSpeed(int[] piles, int h) {
        int l=1,r=Arrays.stream(piles).max().getAsInt();
        int res=r;
        while(l<=r)
        {
            int m=l+(r-l)/2;
            if(fin(piles,h,m))
            {
                res=m;
                r=m-1;
            }
            else
            l=m+1;
        }
        return res;
    }

    private boolean fin(int piles[],int h,int k)
    {
        long hr=0;
        for(int p:piles)
        {
            hr+=p/k;
            if(p%k!=0)
            hr++;
        }
        return hr<=h;
    }
}