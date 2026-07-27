//Task Scheduler(LC 621)
//Using a hashtable and then iteration

package GoldmanSachs.Med;
import java.util.*;
class p115{
    public int leastInterval(char[] tasks, int n) {
        int arr[]=new int[26];
        for(char t:tasks)
        arr[t-'A']++;

        Arrays.sort(arr);
        int c=arr[25]-1,i=c*n;
        for(int j=24;j>=0;j--)
        i-=Math.min(c,arr[j]);

        return i<0?tasks.length:tasks.length+i;
    }
}