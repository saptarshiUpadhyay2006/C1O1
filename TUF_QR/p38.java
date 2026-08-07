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
import java.util.*;
class p38{
    public boolean twoSumBST(TreeNode root, int k) {
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
        arr.add(node.data);
        help(node.right,arr);
    }
}