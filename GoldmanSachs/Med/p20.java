//Find Minm in rotated sorted array(LC 153)
//using binary search to find the minm using bitwise operator

package GoldmanSachs.Med;

class p20{
    public int findMin(int[] nums) {
        int n=nums.length-1;
        int lst=nums[n];
        int l=0,r=n;
        while(l<r)
        {
            int m=(l+r)>>1;
            if(nums[m]>lst)
            l=m+1;
            else
            r=m;
        }
        return nums[l];
    }
}
