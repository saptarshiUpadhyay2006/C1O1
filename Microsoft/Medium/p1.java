//No of Substrings with 1s(LC 1513)
//Optimal----find the pattern for no. of substrings for n continuous 1s----T.C:O(n)------S.C:O(1)
//USING THE LC TEMPLATE

package Microsoft.Medium;

class p1{
    public int numSub(String s) {
        int mod=1000000007;
        long c=0;
        long res=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='1')
            c++;
            else
            {
                long sz=(c*(c+1))/2;
                sz%=mod;
                res=(res+sz)%mod;
                c=0;
            }
        }
        long sz=(c*(c+1))/2;
        sz%=mod;
        res=(res+sz)%mod;
        return (int)res;
    }
}