package TUF_QR;
import java.util.*;
class p15{
    static class MeetingComparator implements Comparator<int[]>{
        public int compare(int a[],int b[])
        {
            return Integer.compare(a[1],b[1]);
        }
    }
    public int maxMeetings(int[] start, int[] end) {
       //your code goes here
        int n=start.length;
        List<int[]> arr=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            arr.add(new int[]{start[i],end[i]});
        }

        Collections.sort(arr,new MeetingComparator());
        int l=arr.get(0)[1];
        int c=1;

        for(int i=1;i<n;i++)
        {
            if(arr.get(i)[0]>l)
            {
                l=arr.get(i)[1];
                c++;
            }
        }
        return c;
    }
}