package TUF_QR;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int data;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int val) { data = val; left = null, right = null }
 * }
 **/

class p34{
    public TreeNode lca(TreeNode root, int p, int q) {
        //your code goes here
        if(root==null)
        return null;
        int curr=root.data;
        if(curr<p && curr<q)
        return lca(root.right,p,q);
        if(curr>p && curr>q)
        return lca(root.left,p,q);
        return root;
    }
}