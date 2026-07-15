//Count palindromic subsequences(LC 2484)
//Optimal--------T.C:O(n)------S.C:O(n)
//USING THE LC TEMPLATE

package Atlassian.Hard;

class Solution {
    private static final int M=1_000_000_007;
    public int countPalindromes(String s) {
        int n=s.length();
        long tc=0;
        for (char c='0';c<='9';c++){
            for (char d='0';d<='9';d++){
                long sc[]= new long[n];
                long cbd=0;
                long cc=0;
                for (int i=0;i<n;i++){
                    sc[i] = cbd;
                    char ch=s.charAt(i);
                    if(ch==d){
                        cbd+= cc;
                    }
                    if(ch==c){
                        cc++;
                    }
                }
                cbd=0;
                cc=0;
                for(int i=n-1;i>=3;i--){
                    char ch=s.charAt(i);
                    if(ch==d){
                        cbd+=cc;
                    }
                    if(ch==c){
                        cc++;
                    }
                    tc=(tc+cbd*sc[i-1])%M;
                }
            }
        }

        return (int) tc;
    }
}