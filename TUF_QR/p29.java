package TUF_QR;


import java.util.*;
 class p29{
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //your code goes here
        if(root==null||root==p||root==q)
        return root;

        TreeNode l=lowestCommonAncestor(root.left,p,q);
        TreeNode r=lowestCommonAncestor(root.right,p,q);

        if(l==null)
        return r;
        else if(r==null)
        return l;
        else
        return root;
    }
}
class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) { data = val; left = null; right = null; }
}
