//Two Sum IV-Input is a BST
//inorder and then check using helper fn

package GoldmanSachs.Med;
import java.util.*;
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
class p194{
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> arr=inorder(root);
        int l=0,r=arr.size()-1;
        while(l<r)
        {
            int cs=arr.get(l)+arr.get(r);
            if(cs==k)
            return true;
            else if(cs<k)
            l++;
            else
            r--;
        }
        return false;
    }
    private List<Integer> inorder(TreeNode root)
    {
        List<Integer> arr=new ArrayList<>();
        help(root,arr);
        return arr;
    }
    private void help(TreeNode node,List<Integer> arr)
    {
        if(node==null)
        return;
        help(node.left,arr);
        arr.add(node.val);
        help(node.right,arr);
    }
}