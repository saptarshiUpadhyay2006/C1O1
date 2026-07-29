//kth ancestor of a tree node(LC 1483)
//using dp

package GoldmanSachs.Med;

class TreeAncestor {
    int dp[][];
    int mr;
    public TreeAncestor(int n, int[] parent) {
        mr=(int)(Math.log(n)/Math.log(2))+1;
        dp=new int[mr][n];
        dp[0]=parent;
        for(int i=1;i<mr;i++)
        {
            for(int j=0;j<n;j++)
            {
                int pre=dp[i-1][j];
                dp[i][j]=pre==-1?-1:dp[i-1][pre];
            }
        }
    }
    
    public int getKthAncestor(int node, int k) {
        int mr=this.mr;
        while(k>0 && node>-1)
        {
            if(k>=1<<mr)
            {
                node=dp[mr][node];
                k-=1<<mr;
            }
            else{
                mr--;
            }
        }
        return node;
    }
}

/**
 * Your TreeAncestor object will be instantiated and called as such:
 * TreeAncestor obj = new TreeAncestor(n, parent);
 * int param_1 = obj.getKthAncestor(node,k);
 */