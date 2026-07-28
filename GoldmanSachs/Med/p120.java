//Merge Sorted Array(LC 88)
//using sort STLs

package GoldmanSachs.Med;
import java.util.*;
class p120{
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int j=0,i=m;j<n;j++)
        {
            nums1[i]=nums2[j];
            i++;
        }
        Arrays.sort(nums1);
    }
}