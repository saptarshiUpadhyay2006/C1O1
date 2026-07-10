//k-smallest in BST(LC 230)
//Optimal---Using Inorder traversal----T.C:O(n)------S.C:O(n)
//USING THE LC TEMPLATE
package Google.Medium;
import java.util.*;

class Solution {
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> arr=new ArrayList<>();
        inorder(root,arr);
        return arr.get(k-1);
    }
    private void inorder(TreeNode root,ArrayList<Integer> arr)
    {
        if(root==null)
        return;

        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
    }
}