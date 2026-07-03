//Merge Sorted Array nums1 and nums2 and store the result in nums1
//Brute Force Approach--Store and Sort----T.C:O(nlogn)------S.C:O(n)
//USING THE LC TEMPLATE
package Amazon.Easy;
import java.util.*;

class p3{
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=0;
        for(int i=m;i<m+n;i++)
        {
            nums1[i]=nums2[j];
            j++;
        }
        Arrays.sort(nums1);
    }
}