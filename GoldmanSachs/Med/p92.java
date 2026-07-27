//Minm value to get positive step by step sum(LC 1413)
//1-Min(prefix sum)

package GoldmanSachs.Med;

class p92{
    public int minStartValue(int[] nums) {
        int mini=0,ps=0;
        for(int x:nums)
        {
            ps+=x;
            mini=Math.min(mini,ps);
        }
        return 1-mini;
    }
}