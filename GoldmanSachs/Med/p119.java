//Largest Rectangle in Histogram(LC 84)
//using ll & lr ptr.

package GoldmanSachs.Med;

class p119{
    public int largestRectangleArea(int[] heights) {
        int len=heights.length;
        int lr[]=new int[len];
        int ll[]=new int[len];
        ll[0]=-1;
        lr[len-1]=len;

        for(int i=1;i<len;i++)
        {
            int idx=i-1;
            while(idx>=0)
            {
                if(heights[idx]>=heights[i])
                idx=ll[idx];
                else
                break;
            }
            ll[i]=idx;
        }
        for(int i=len-2;i>=0;i--)
            {
                int idx=i+1;
                while(idx<len)
                {
                    if(heights[idx]>=heights[i])
                    idx=lr[idx];
                    else
                    break;
                }
                lr[i]=idx;
            }
            int res=0;
            for(int i=0;i<len;i++)
            {
                int c=(lr[i]-ll[i]-1)*(heights[i]);
                res=Math.max(res,c);
            }
            return res;
    }
}