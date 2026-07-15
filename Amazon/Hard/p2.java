//Median of 2 sorted arrays(LC 4)
//Optimal Approach----T.C:O(log(min(m,n)))------S.C:O(1)
//USING THE LC TEMPLATE

package Amazon.Hard;

class p2{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1=nums1.length;
        int n2=nums2.length;
        if(n1>n2)
        return findMedianSortedArrays(nums2,nums1);

        int l=0,h=n1;
        while(l<=h)
        {
            int m1=(l+h)/2;
            int m2=(n1+n2+1)/2-m1;
            double l1=(m1==0)?Integer.MIN_VALUE:nums1[m1-1];
            double r1=(m1==n1)?Integer.MAX_VALUE:nums1[m1];
            double l2=(m2==0)?Integer.MIN_VALUE:nums2[m2-1];
            double r2=(m2==n2)?Integer.MAX_VALUE:nums2[m2];

            if(l1<=r2 && l2<=r1)
            {
                if((n1+n2)%2==0)
                return (double)(Math.max(l1,l2)+Math.min(r1,r2))/2;
                else
                return (double)Math.max(l1,l2);
            }
            else if(l1>r2)
            h=m1-1;
            else
            l=m1+1;
        }
        return 0;
    }
}