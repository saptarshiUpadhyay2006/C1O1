//Sqrt(x)(LC 69)
//using binary search & bit Man

package GoldmanSachs.Med;

class p67{
    public int mySqrt(int x) {
        if(x<2) 
        return x;

        int l=1,r=x/2;
        while(l<=r) 
        {
            int m=l+(r-l)/2;
            long sq=(long)m*m;
            if(sq==x)
                return m;
            else if(sq<x)
                l=m+1;
            else
                r=m-1;
        }

        return r;   
    }
}