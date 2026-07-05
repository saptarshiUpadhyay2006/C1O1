//Invert BT(LC 226)
//Optimal----Observe the pattern-----T.C:O(n)------S.C:O(n)
//USING THE LC TEMPLATE
package Google.Easy;
import java.util.*;
public class p2{
    public TreeNode invertTree(TreeNode root) {
        if(root==null)
        return root;

        TreeNode tm;
        tm=root.left;
        root.left=root.right;
        root.right=tm;

        invertTree(root.left);
        invertTree(root.right);
        return root;
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
