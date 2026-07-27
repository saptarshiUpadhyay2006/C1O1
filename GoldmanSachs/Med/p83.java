//Binary tree cameras(LC 968)
//Using DFS Approach

package GoldmanSachs.Med;

public class p83{
    int val;
    p83 left;
    p83 right;
    p83() {}
    p83(int val) { this.val = val; }
    p83(int val, p83 left, p83 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
class Solution {
    private int n=0;
    public int minCameraCover(p83 root) {
        return dfs(root)==-1?n+1:n;
    }
    private int dfs(p83 root) {
        if(root==null) 
        return 0;
        
        int left=dfs(root.left);
        int right=dfs(root.right);
        if(left==-1||right==-1){
            n++;
            return 1; 
        }
        if(left==1||right==1)
            return 0; 
        
        return -1;
    }
}