//Magnetic force b/w balls(LC 1552)
//use binary search

package GoldmanSachs.Med;
import java.util.*;
class p159{
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int lo=1;
        int hi=(position[position.length-1]-position[0])/(m-1);
        int res=1;
        while(lo<=hi)
        {
            int mi=lo+(hi-lo)/2;
            if(can(position,mi,m))
            {
                res=mi;
                lo=mi+1;
            }
            else
                hi=mi-1;
        }
        return res;
    }
    private boolean can(int[] arr, int dist, int cows)
    {
        int cntCows=1;
        int last=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]-last>=dist)
            {
                cntCows++;
                last = arr[i];
            }
            if(cntCows>=cows)
            {
                return true;
            }
        }
        return false;
    }
}