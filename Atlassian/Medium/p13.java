//Smallest Missing Non-negative Integer After Operations(LC 2598)
//Optimal---------T.C:O(n)------S.C:O(n)
//USING THE LC TEMPLATE

package Atlassian.Medium;
import java.util.*;

class p13{
    public int findSmallestInteger(int[] nums, int value) {
        int n=nums.length;
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            int v=(nums[i]%value+value)%value;
            if(v<n)
            arr[v]++;
        }
        int res=n;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                res=i;
                break;
            }
            else
            {
                arr[i]--;
                if(arr[i]>=1 && i+value<n)
                {
                    arr[i+value]+=arr[i];
                    arr[i]=0;
                }
            }
        }
        return res;
    }
}