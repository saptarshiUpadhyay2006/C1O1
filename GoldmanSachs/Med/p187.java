//Maxm sum circular subarray(Lc 918)

package GoldmanSachs.Med;

class p187{
    public int maxSubarraySumCircular(int[] nums) {
        int ts=0;
        int cur=0;
        int maxi=Integer.MIN_VALUE;
        for(int i:nums) {
            cur=Math.max(cur+i,i);
            maxi=Math.max(maxi,cur);
            ts+=i;
        }
        cur=0;
        int mini=Integer.MAX_VALUE;
        for(int i:nums) {
            cur=Math.min(cur+i,i);
            mini=Math.min(mini,cur);
        }
        if(ts==mini)
            return maxi;
        return Math.max(maxi,(ts-mini));
    }
}
