//Beautiful Arrangement(LC 526)
//Optimal Soln----Backtracking-----T.C:O(n!)------S.C:O(n)
//USING THE LC TEMPLATE
package GS.Medium;

class p1{
    public int countArrangement(int n) {
        int vis[]=new int[n+1];
        for(int i=0;i<n+1;i++)
        vis[i]=0;

        int res=bt(vis,1,n);
        return res;
    }
    private static int bt(int vis[],int i,int n)
    {
        if(i>n)
        return 1;
        int c=0;
        for(int x=1;x<=n;x++)
        {
            if(vis[x]==0 && (x%i==0||i%x==0))
            {
                vis[x]=1;
                c+=bt(vis,i+1,n);
                vis[x]=0;
            }
        }
        return c;
    }
}