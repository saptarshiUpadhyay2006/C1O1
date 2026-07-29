//Length of longest fibonacci subseq(LC 873)
//use a hashSet

package GoldmanSachs.Med;
import java.util.*;
class p205{
    public int lenLongestFibSubseq(int[] arr) {
        int n=arr.length;
        HashSet<Integer> set=new HashSet<>();
        for (int i:arr)
            set.add(i);
        int max=0;
        for(int i=0;i<n-1;i++)
        {
            for (int j=i+1;j<n;j++)
            {
                int first=arr[i],second=arr[j];
                if(set.contains(first+second)){
                    int curr=2;
                    while(set.contains(first+second)){
                        curr++;
                        int temp=first+second;
                        first=second;
                        second=temp;
                    }
                    max=Math.max(max,curr);
                }
            }
        }
        return max;
    }
}