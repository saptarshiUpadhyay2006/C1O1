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
import java.util.ArrayList;
import java.util.List;
class p33{
    public List<Integer> getInorder(TreeNode root) {
        List<Integer> inorder = new ArrayList<>();
        TreeNode cur = root; 

        while (cur != null) {
            if (cur.left == null) {
                inorder.add(cur.data); 
                cur = cur.right; 
            } else {
                TreeNode prev = cur.left; 
                while (prev.right != null && prev.right != cur) {
                    prev = prev.right;
                }
                if (prev.right == null) {
                    prev.right = cur; 
                    cur = cur.left; 
                } else {   
                    prev.right = null; 
                    inorder.add(cur.data); 
                    cur = cur.right; 
                }
            }
        }
        return inorder; 
    }
}