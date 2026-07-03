//Merge Sorted Array nums1 and nums2 and store the result in nums1
//Optimal Approach---Two pointers in the two arrays---T.C:O(M+N)------S.C:O(1)
//USING THE LC TEMPLATE
package Amazon.Easy;

class p4{
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1,j=n-1,x=m+n-1;
        while(i>=0 && j>=0)
        {
            if(nums1[i]>nums2[j])
            {
                nums1[x]=nums1[i];
                x--;
                i--;
            }
            else{
                nums1[x]=nums2[j];
                x--;
                j--;
            }
        }
        while(j>=0)
        {
            nums1[x]=nums2[j];
            j--;
            x--;
        }
    }
}