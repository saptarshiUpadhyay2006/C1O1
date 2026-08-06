package TUF_QR;

class p25 {
    public int trap(int[] height) {
       int n=height.length;
       int l=0,r=n-1,lm=0,rm=0,t=0;
       while(l<r)
       {
        if(height[l]<height[r])
        {
            if(lm>height[l])
            t+=lm-height[l];
            else
            lm=height[l];
            l++;
        }
        else{
            if(rm>height[r])
            t+=rm-height[r];
            else
            rm=height[r];
            r--;
        }
       }
       return t;
    }
}
