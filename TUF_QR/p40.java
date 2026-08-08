package TUF_QR;

class p40{
    public void heapSort(int[] nums) {
        buildMax(nums);
        int l=nums.length-1;
        while(l>0)
        {
            int t=nums[0];
            nums[0]=nums[l];
            nums[l]=t;
            l--;
            if(l>0)
            heapifyDown(nums,l,0);
        }
        return;
    }
    private void buildMax(int nums[])
    {
        int n=nums.length;
        for(int i=n/2-1;i>=0;i--)
        {
            heapifyDown(nums,n-1,i);
        }
        return;
    }
    private void heapifyDown(int arr[],int l,int ind)
    {
        int li=ind;
        int left=2*ind+1,right=2*ind+2;
        if(left<=l && arr[left]>arr[li])
        li=left;
        if(right<=l && arr[right]>arr[li])
        li=right;
        if(li!=ind)
        {
            int t=arr[li];
            arr[li]=arr[ind];
            arr[ind]=t;
            heapifyDown(arr,l,li);
        }
        return;
    }
}