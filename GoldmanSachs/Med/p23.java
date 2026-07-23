//Best time to buy & sell stock II(LC 122)
//Using a greedy approach

package GoldmanSachs.Med;

class p23{
    public int maxProfit(int[] prices) {
        int p=0;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]>prices[i-1])
            p+=prices[i]-prices[i-1];
        }
        return p;
    }
}