//kth-symbol in grammar(LC 779)
//Optimal--------T.C:O(1)------S.C:O(1)
//USING THE LC TEMPLATE

package DEShaw.Medium;

class p7{
    public int kthGrammar(int n, int k) {
        return Integer.bitCount(k-1)&1;
    }
}