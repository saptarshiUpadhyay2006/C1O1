//Best time to buy & sell stock(LC 121)
//iteration keeping track of max profit

package GoldmanSachs.Med;

class p19{
    public int maxProfit(int[] prices) {
        int mp=0,mini=prices[0];
        for(int i=0;i<prices.length;i++)
        {
            int c=prices[i]-mini;
            mp=Math.max(c,mp);
            mini=Math.min(mini,prices[i]);
        }
        return mp;
    }
}