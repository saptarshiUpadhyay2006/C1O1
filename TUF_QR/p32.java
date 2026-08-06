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
class p32{
    public int timeToBurnTree(TreeNode root, int start) {
        //your code goes here
        HashMap<TreeNode,TreeNode> mp=new HashMap<>();
        TreeNode target=bfsToMap(root,mp,start);
        int maxi=findMax(mp,target);
        return maxi;
    }
    private TreeNode bfsToMap(TreeNode root,HashMap<TreeNode,TreeNode> mp,int start)
    {
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        TreeNode res=new TreeNode(-1);
        while(!q.isEmpty())
        {
            TreeNode node=q.poll();
            if(node.data==start)
            res=node;
            if(node.left!=null)
            {
                mp.put(node.left,node);
                q.offer(node.left);
            }
            if(node.right!=null)
            {
                mp.put(node.right,node);
                q.offer(node.right);
            }
        }
        return res;
    }
    private int findMax(HashMap<TreeNode,TreeNode> mp,TreeNode target)
    {
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(target);
        HashMap<TreeNode,Integer> vis=new HashMap<>();
        vis.put(target,1);
        int maxi=0;
        while(!q.isEmpty())
        {
            int sz=q.size();
            int fl=0;
            for(int i=0;i<sz;i++)
            {
                TreeNode node=q.poll();
                if(node.left!=null && vis.get(node.left)==null)
                {
                    fl=1;
                    vis.put(node.left,1);
                    q.offer(node.left);
                }
                if(node.right!=null && vis.get(node.right)==null)
                {
                    fl=1;
                    vis.put(node.right,1);
                    q.offer(node.right);
                }

                if(mp.get(node)!=null && vis.get(mp.get(node))==null)
                {
                    fl=1;
                    vis.put(mp.get(node),1);
                    q.offer(mp.get(node));
                }
            }
            if(fl==1)
            maxi++;
        }
        return maxi;
    }
}