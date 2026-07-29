//Distribute Coins in Binary tree(LC 979)
//using dfs

package GoldmanSachs.Med;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class p157{
    private int m=0;
    public int distributeCoins(TreeNode root) {
        dfs(root);
        return m;
    }

    private int dfs(TreeNode node)
    {
        if(node==null)
        return 0;
        int l=dfs(node.left);
        int r=dfs(node.right);
        m+=Math.abs(l)+Math.abs(r);
        return node.val+l+r-1;
    }
}