//Next greater el I(LC 496)

package GoldmanSachs.Med;

class p175{
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int arr[]=new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j])
                arr[i]=j;
            }
        }
        int res[]=new int[nums1.length];
        for(int i=0;i<arr.length;i++)
        {
            int c=0;
            for(int j=arr[i];j<nums2.length;j++)
            {
                if(nums2[j]>nums1[i] && c==0)
                {
                    c++;
                    res[i]=nums2[j];
                }
            }
            if(c==0)
            res[i]=-1;
        }
        return res;
    }
}