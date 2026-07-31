//Minm number of taps to open to water a garden

package DEShaw.Hard;

class p2{
    public int minTaps(int n, int[] ranges) {
        int maxi[]=new int[n + 1];
        for(int i=0;i<ranges.length;i++){
            int l=Math.max(0,i-ranges[i]);
            int r=Math.min(n,i+ranges[i]);
            maxi[l]=Math.max(maxi[l],r);
        }
        int e=0;
        int f=0;
        int t=0;
        int i=0;
        while(e<n){
            while(i<=e){
                f=Math.max(f,maxi[i]);
                i++;
            }
            
            if(f<=e)
                return -1;
            
            e=f;
            t++;
        }
        
        return t;
    }
}