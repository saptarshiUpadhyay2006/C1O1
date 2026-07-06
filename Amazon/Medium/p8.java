//FLatten BT to LL(LC 114)
//Optimal Approach---Use HashMap----T.C:O(nmlogm)------S.C:O(nm)
//USING THE LC TEMPLATE
package Amazon.Medium;
import java.util.*;

class p8{
    public void flatten(TreeNode root) {
        TreeNode curr=root;
        while(curr!=null)
        {
            if(curr.left!=null)
            {
                TreeNode temp=curr.left;
                while(temp.right!=null)
                temp=temp.right;
                temp.right=curr.right;
                curr.right=curr.left;
                curr.left=null;
            }
            curr=curr.right;
        }
    }
}
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