//Meeting Rooms III(LC 2402)
//comparing

package GoldmanSachs.Med;
import java.util.*;
class p198{
    public int mostBooked(int n, int[][] meetings) {
        int arr[]=new int[n];
        long barr[]=new long[n];
        Arrays.sort(meetings,(a,b)->a[0]-b[0]);
        for(int meeting[]:meetings)
        {
            int st=meeting[0],end=meeting[1];
            long ea=Long.MAX_VALUE;
            int ri=-1;
            boolean b=false;
            for (int i=0;i<n;i++){
                if(barr[i]<ea){
                    ea=barr[i];
                    ri=i;
                }
                if(barr[i]<=st){
                    barr[i]=end;
                    arr[i]++;
                    b=true;
                    break;
                }
            }
            if(!b){
                barr[ri]+=(end-st);
                arr[ri]++;
            }
        }
        int maxi=0,res=0;
        for (int i=0;i<n;i++){
            if(arr[i]>maxi){
                maxi=arr[i];
                res=i;
            }
        }
        return res;
    }
}