package TUF_QR;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int data;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int data) { data = val; left = null, right = null }
 * }
 **/
import java.util.*;
class p36{
    private List<Integer> arr=new ArrayList<>();
    private int idx=0;
    void recoverTree(TreeNode root) {
        inorder(root);
        Collections.sort(arr);
        restore(root);
    }
    private void inorder(TreeNode node)
    {
        if(node==null)
        return;

        inorder(node.left);
        arr.add(node.data);
        inorder(node.right);
    }
    private void restore(TreeNode root)
    {
        if(root==null)
        return;

        restore(root.left);
        root.data=arr.get(idx++);
        restore(root.right);
    }
}