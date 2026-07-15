//Count vowels permutation(LC 1220)
//Optimal--------T.C:O(n)------S.C:O(1)
//USING THE LC TEMPLATE

package Atlassian.Hard;

class Solution {
    public int countVowelPermutation(int n) {
        final int MOD=1000000007;
        long a=1,e=1,i=1,o=1,u=1;
        for(int j=1;j<n;j++){
            long an=e;
            long en=(a+i)%MOD;
            long in=(a+e+o+u)%MOD;
            long on=(i+u)%MOD;
            long un=a;
            a=an;
            e=en;
            i=in;
            o=on;
            u=un;
        }
        return (int)((a+e+i+o+u)%MOD);
    }
}