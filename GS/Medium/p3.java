//Gas Station(LC 134)
//Optimal Soln----Greedy Approach-----T.C:O(n)------S.C:O(1)
//USING THE LC TEMPLATE
package GS.Medium;

class p3{
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sg=0,sc=0,res=0,t=0;
        for(int i=0;i<gas.length;i++)
        {
            sg+=gas[i];
            sc+=cost[i];
        }
        if(sg<sc)
        return -1;
        for(int i=0;i<gas.length;i++)
        {
            t+=gas[i]-cost[i];
            if(t<0)
            {
                t=0;
                res=i+1;
            }
        }
        return res;
    }
}