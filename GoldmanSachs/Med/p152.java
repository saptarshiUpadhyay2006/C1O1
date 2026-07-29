//Find First and Last Position of Element in Sorted Array
//Using binary search

package GoldmanSachs.Med;

class p152{
    public int[] searchRange(int[] nums, int target) {
       int arr[]={-1,-1};
       int l=binary(nums,target,true);
       int r=binary(nums,target,false);
       arr[0]=l;
       arr[1]=r;
       return arr; 
    }

    private int binary(int nums[],int target,boolean bl)
    {
        int l=0,r=nums.length-1,idx=-1;
        while(l<=r)
        {
            int m=l+(r-l)/2;
            if(nums[m]>target)
            r=m-1;
            else if(nums[m]<target)
            l=m+1;
            else
            {
                idx=m;
                if(bl)
                r=m-1;
                else
                l=m+1;
            }
        }
        return idx;
    }
}