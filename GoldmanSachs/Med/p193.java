//Count good nodes in BT
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
class p193{
    public int goodNodes(TreeNode root) {
        return dfs(root,root.val);
    }
    private int dfs(TreeNode node,int maxi)
    {
        if(node==null)
        return 0;

        int c=0;
        if(node.val>=maxi)
        c=1;
        maxi=Math.max(maxi,node.val);
        c+=dfs(node.left,maxi);
        c+=dfs(node.right,maxi);
        return c;
    }
}