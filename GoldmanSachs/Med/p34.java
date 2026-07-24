//Shortest subarray with sum atleast k(LC 862)
//USe a Prefix Sum & Deque DS
package GoldmanSachs.Med;
import java.util.*;

class p34{
    public int shortestSubarray(int[] nums, int k) {
        int n=nums.length;
        int arr[]=new int[n+1];
        for(int i=0;i<n;i++)
        {
            arr[i+1]=arr[i]+nums[i];
        }
        int res=n+1;
        Deque<Integer> dq=new LinkedList();
        for(int i=0;i<arr.length;++i)
        {
            while(!dq.isEmpty() && arr[i]<=arr[dq.getLast()])
            dq.removeLast();
            while(!dq.isEmpty() && arr[i]>=arr[dq.getFirst()]+k)
            res=Math.min(res,i-dq.removeFirst());

            dq.addLast(i);
        }
        return res<n+1?res:-1;
    }
}