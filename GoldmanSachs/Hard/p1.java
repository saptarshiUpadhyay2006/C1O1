//Trapping Rainwater(LC 42)
//using the 2 pointer approach and min(lmax,rmax)-ht[i]

package GoldmanSachs.Hard;

class p1{
    public int trap(int[] height) {
        int n=height.length;
        int lm=0,rm=0;
        int tw=0;
        int l=0,r=n-1;

        while(l<r)
        {
            lm=Math.max(lm,height[l]);
            rm=Math.max(rm,height[r]);
            if(lm<rm)
            {
                tw+=lm-height[l];
                l++;
            }
            else
            {
                tw+=rm-height[r];
                r--;
            }
        }
        return tw;
    }
}