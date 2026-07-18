//Maxm subseq score(LC 2542)
//Optimal--------T.C:O(nlogn)------S.C:O(n)
//USING THE LC TEMPLATE

package DEShaw.Medium;
import java.util.*;
class p6{
    public long maxScore(int[] nums1, int[] nums2, int k) {
        int n=nums1.length;
        int arr[][]=new int[n][2];
        for(int i=0;i<n;++i)
        arr[i]=new int[]{nums2[i],nums1[i]};

        Arrays.sort(arr,(a,b)->b[0]-a[0]);
        PriorityQueue<Integer> pq=new PriorityQueue<>(k,(a,b)->a-b);

        long r=0,ss=0;
        for(int i[]:arr)
        {
            pq.add(i[1]);
            ss+=i[1];
            if(pq.size()>k)
            ss-=pq.poll();
            if(pq.size()==k)
            r=Math.max(r,(ss*i[0]));
        }
        return r;
    }
}