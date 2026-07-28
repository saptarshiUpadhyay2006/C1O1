//Gas Station(LC 134)
//Total cost & gal calculation.

package GoldmanSachs.Med;

class p121{
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tg=0,tc=0;
        for(int i=0;i<gas.length;i++)
        {
            tg+=gas[i];
            tc+=cost[i];
        }
        if(tg<tc)
        return -1;
        int cg=0,st=0;
        for(int i=0;i<gas.length;i++)
        {
            cg+=gas[i]-cost[i];
            if(cg<0)
            {
                cg=0;
                st=i+1;
            }
        }
        return st;
    }
}