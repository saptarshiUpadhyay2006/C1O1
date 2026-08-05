package TUF_QR;

class p14{
    public int findPlatform(int[] Arrival, int[] Departure) {
        //your code goes here
        int n=Arrival.length;
        int res=1;
        for(int i=0;i<n;i++)
        {
            int c=1;
            for(int j=0;j<n;j++)
            {
                if(i!=j)
                {
                    if((Arrival[i]>=Arrival[j] && Departure[j]>=Arrival[i]))
                    c++;
                    res=Math.max(res,c);
                }
            }
        }
        return res;
    }
}