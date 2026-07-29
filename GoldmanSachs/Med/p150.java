//Path Sum(LC 112)
//using dfs approach

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
class p150{
    public boolean hasPathSum(TreeNode root, int targetSum) {
        List<List<Integer>> arr=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        dfs(root,curr,arr);
        for(int i=0;i<arr.size();i++)
        {
            int s=0;
            for(int j=0;j<arr.get(i).size();j++)
            s+=arr.get(i).get(j);

            if(s==targetSum)
            return true;
        }
        return false;
    }

    private void dfs(TreeNode node,List<Integer> path,List<List<Integer>> arr)
    {
        if(node==null)
        return;
        path.add(node.val);
        if(node.left==null && node.right==null)
        arr.add(new ArrayList<>(path));
        else
        {
            dfs(node.left,path,arr);
            dfs(node.right,path,arr);
        }
        path.remove(path.size()-1);
    }
}