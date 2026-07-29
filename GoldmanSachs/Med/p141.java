//Validate BST(LC 98)
//Use the lv & rv to validate

package GoldmanSachs.Med;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }
class p141{
    public boolean isValidBST(TreeNode root) {
        return check(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    private boolean check(TreeNode node,long min,long max)
    {
        if(node==null)
        return true;

        if(node.val<=min || node.val>=max)
        return false;

        boolean lv=check(node.left,min,node.val);
        boolean rv=check(node.right,node.val,max);

        return lv && rv;
    }
}