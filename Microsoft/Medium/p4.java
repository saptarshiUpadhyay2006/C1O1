//No. of 1 bits(LC 191)
//Optimal---Using & operator---T.C:O(logn)------S.C:O(1)
//USING THE LC TEMPLATE

package Microsoft.Medium;
class p4{
    public int hammingWeight(int n) {
        int c=0;
        for(int i=0;i<32;i++)
        {
            if((n&1)==1)
            c++;
            n>>=1;
        }
        return c;
    }
}