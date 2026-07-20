//Maxm OR(LC 2680)
//Optimal--------T.C:O(n)------S.C:O(n)
//USING THE LC TEMPLATE

package DEShaw.Medium;

class p11{
    public long maximumOr(int[] nums, int k) {
        int n=nums.length;
        long res=0;
        int pre[]=new int[n+1];
        int suf[]=new int[n+1];
        for(int i=1;i<n;i++)
        {
            pre[i]=pre[i-1]|nums[i-1];
            suf[n-i-1]=suf[n-i]|nums[n-i];
        }
        for(int i=0;i<n;i++)
        res=Math.max(res,pre[i]|((long)nums[i]<<k)|suf[i]);
        return res;
    }
}