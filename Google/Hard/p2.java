//Maximal Rectangle(LC 85)
//Optimal Approach----T.C:O(m*n)------S.C:O(n)
//USING THE LC TEMPLATE

package Google.Hard;

class p2{
    public int maximalRectangle(char[][] matrix) {
        int r=matrix.length,c=matrix[0].length;
        int dp[]=new int[c];
        int maxi=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(matrix[i][j]=='1')
                dp[j]=dp[j]+1;
                else if(matrix[i][j]=='0')
                dp[j]=0;
            }
            maxi=Math.max(fac(dp),maxi);
        }
        return maxi;
    }
    private int fac(int heights[])
    {
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