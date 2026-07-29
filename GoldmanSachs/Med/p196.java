//kth symbol in grammar(LC 779)
//bitwise op

package GoldmanSachs.Med;

class p196{
    public int kthGrammar(int n, int k) {
        return Integer.bitCount(k-1)&1;
    }
}