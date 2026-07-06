//Sum root to leaf nodes(LC 129)
//Optimal-----Recursively -T.C:O(n)------S.C:O(n)
//USING THE LC TEMPLATE
package Google.Medium;
import java.util.*;

class p6{
    public int sumNumbers(TreeNode root) {
        return sum(root,0);
    }
    private int sum(TreeNode root,int cs)
    {
        if(root==null)
        return 0;
        cs=cs*10+root.val;

        if(root.left==null && root.right==null)
        return cs;
        int ls=sum(root.left,cs);
        int rs=sum(root.right,cs);
        return ls+rs;
    }
}
class TreeNode{
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