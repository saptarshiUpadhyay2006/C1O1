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

class p37{
    class NodeValue {
        int minNode,maxNode,maxSize;
        NodeValue(int minNode, int maxNode, int maxSize) {
            this.minNode = minNode;
            this.maxNode = maxNode;
            this.maxSize = maxSize;
        }
    }
    public int largestBST(TreeNode root) {
        //your code goes here
        return rec(root).maxSize;
    }
    private NodeValue rec(TreeNode node)
    {
        if(node==null)
        return new NodeValue(Integer.MAX_VALUE,Integer.MIN_VALUE,0);

        NodeValue l=rec(node.left);
        NodeValue r=rec(node.right);
        if(l.maxNode<node.data && node.data<r.minNode)
        {
            return new NodeValue(Math.min(node.data,l.minNode),Math.max(node.data,r.maxNode),l.maxSize+r.maxSize+1);
        }
        return new NodeValue(Integer.MIN_VALUE,Integer.MAX_VALUE,Math.max(l.maxSize,r.maxSize));
    }
}