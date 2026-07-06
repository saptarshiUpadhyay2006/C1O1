//Minimum Number of Swaps to Make the Binary String Alternating(LC 1864)
//Optimal Approach----T.C:O(n)------S.C:O(1)
//USING THE LC TEMPLATE
package Amazon.Medium;

class p9{
    public int minSwaps(String s) {
        int c0=0,c1=0,m0=0,m1=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='0')
            c0++;
            else
            c1++;
        }
        if(Math.abs(c0-c1)>1)
        return -1;

        for(int i=0;i<s.length();i+=2)
        {
            if(s.charAt(i)!='0')
            m0++;
            else
            m1++;
        }
        return c0==c1?Math.min(m0,m1):c0>c1?m0:m1;
    }
}