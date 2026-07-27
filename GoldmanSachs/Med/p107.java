//Maxm XOR of Two no.s in an array(LC 421)
//G phar Qs involving Trie & bitwise

package GoldmanSachs.Med;

class p107{
    static class TrieNode {
        TrieNode children[]=new TrieNode[2];
    }
    TrieNode root=new TrieNode();
    public void insert(int num){
        TrieNode node=root;
        for (int i=31;i>=0;i--){
            int bit=(num>>i)&1;
            if(node.children[bit]==null){
                node.children[bit]=new TrieNode();
            }
            node=node.children[bit];
        }
    }
    public int getMaxXor(int num) {
        TrieNode node=root;
        int maxXor=0;
        for (int i=31;i>=0;i--){
            int bit=(num>>i)&1;
            if(node.children[1-bit]!=null){
                maxXor|=(1<<i);
                node=node.children[1-bit];
            } 
            else{
                node=node.children[bit];
            }
        }
        return maxXor;
    }

    public int findMaximumXOR(int[] nums) {
        for (int num : nums) {
            insert(num);
        }
        int max = 0;
        for (int num : nums) {
            max = Math.max(max, getMaxXor(num));
        }

        return max;
    }
}
