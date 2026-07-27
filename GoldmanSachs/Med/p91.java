//Capacity to ship packages within D days(LC 1011)
//using the binary search app

package GoldmanSachs.Med;

class p91{
    public int shipWithinDays(int[] weights, int days) {
        int maxi=0,s=0;
        for(int w:weights)
        {
            maxi=Math.max(w,maxi);
            s+=w;
        }
        while(maxi<s)
        {
            int m=(maxi+s)/2,n=1,c=0;
            for(int w:weights)
            {
                if(c+w>m)
                {
                    n+=1;
                    c=0;
                }
                c+=w;
            }
            if(n>days)
            maxi=m+1;
            else
            s=m;
        }
        return maxi;
    }
}