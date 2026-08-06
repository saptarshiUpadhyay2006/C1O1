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
class p30{
    public List<Integer> bottomView(TreeNode root) {
        //your code goes here
        List<Integer> res=new ArrayList<>();
        if(root==null)
        return res;

        Map<Integer,Integer> mp=new TreeMap<>();

        Queue<Map.Entry<TreeNode,Integer>> q=new LinkedList<>();
        q.add(new AbstractMap.SimpleEntry<>(root,0));
        while(!q.isEmpty())
        {
            Map.Entry<TreeNode,Integer> curr=q.poll();
            TreeNode node=curr.getKey();
            int l=curr.getValue();

            mp.put(l,node.data);
            if(node.left!=null)
            q.add(new AbstractMap.SimpleEntry<>(node.left,l-1));
            if(node.right!=null)
            q.add(new AbstractMap.SimpleEntry<>(node.right,l+1));
        }
        for(Map.Entry<Integer,Integer> i:mp.entrySet())
        res.add(i.getValue());
        return res;
    }
}