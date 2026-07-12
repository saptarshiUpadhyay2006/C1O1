//4 sum(LC 18)
//Optimal------T.C:O(n^3logn)------S.C:O(k)
//USING THE LC TEMPLATE

package Microsoft.Medium;
import java.util.*;
class p10{
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        int n=nums.length;
        Set<List<Integer>> st=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                for(int k=j+1;k<n;k++)
                {
                    long t=target;
                    t-=nums[i];
                    t-=nums[j];
                    t-=nums[k];
                    int l=k+1,h=n-1;
                    while(l<=h)
                    {
                        int m=l+(h-l)/2;
                        if(nums[m]==t)
                        {
                            List<Integer> arr=new ArrayList<>();
                            arr.add(nums[i]);
                            arr.add(nums[j]);
                            arr.add(nums[k]);
                            arr.add(nums[m]);
                            st.add(arr);
                            break;
                        }
                        else if(nums[m]<t)
                        l=m+1;
                        else
                        h=m-1;
                    }
                }
            }
        }
        List<List<Integer>> li=new ArrayList<>(st);
        return li;
    }
}