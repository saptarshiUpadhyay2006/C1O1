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
class p35{
    List<Integer> succPredBST(TreeNode root, int key) {
        //your code goes here
        TreeNode pre=null;
        TreeNode suc=null;
        TreeNode curr=root;
        while(curr!=null)
        {
            if(key>curr.data)
            {
                pre=curr;
                curr=curr.right;
            }
            else if(key<curr.data)
            {
                suc=curr;
                curr=curr.left;
            }
            else
            {
                if(curr.left!=null)
                {
                    TreeNode temp=curr.left;
                    while(temp.right!=null)
                    temp=temp.right;
                    pre=temp;
                }
                if(curr.right!=null)
                {
                    TreeNode temp=curr.right;
                    while(temp.left!=null)
                    temp=temp.left;
                    suc=temp;
                }
                break;
            }
        }
        int pv=(pre!=null?pre.data:-1);
        int sv=(suc!=null?suc.data:-1);
        List<Integer> res=new ArrayList<>();
        res.add(pv);res.add(sv);
        return res;
    }
}