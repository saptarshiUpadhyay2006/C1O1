package TUF_QR;
import java.util.*;
class p16{
    public int[] JobScheduling(int[][] Jobs) {
        //your code goes here
        Arrays.sort(Jobs,(a,b)->b[2]-a[2]);
        int n=Jobs.length;
        int maxd=-1;
        for(int it[]:Jobs)
        {
            maxd=Math.max(maxd,it[1]);
        }
        int arr[]=new int[maxd];
        Arrays.fill(arr,-1);
        int c=0,tp=0;
        for(int i=0;i<n;i++)
        {
            for(int j=Jobs[i][1]-1;j>=0;j--)
            {
                if(arr[j]==-1)
                {
                    c++;
                    arr[j]=Jobs[i][0];
                    tp+=Jobs[i][2];
                    break;
                }
            }
        }
        return new int[]{c,tp};
    }
}