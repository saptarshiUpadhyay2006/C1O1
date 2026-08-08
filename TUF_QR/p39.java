package TUF_QR;

class p39{
    public void heapify(int[] nums, int ind, int val) {
        if(nums[ind]>val)
        {
            nums[ind]=val;
            heapifyUp(nums,ind);
        }
        else
        {
            nums[ind]=val;
            heapifyDown(nums,ind);
        }
    }
    private void heapifyUp(int arr[],int ind)
    {
        int p=(ind-1)/2;
        if(ind>0 && arr[ind]<arr[p])
        {
            int temp=arr[ind];
            arr[ind]=arr[p];
            arr[p]=temp;
            heapifyUp(arr,p);
        }
    }
    private void heapifyDown(int arr[],int ind)
    {
        int n=arr.length;
        int s=ind;
        int l=2*ind+1;
        int r=2*ind+2;
        if(l<n && arr[l]<arr[s])
        s=l;
        if(r<n && arr[r]<arr[s])
        s=r;

        if(s!=ind)
        {
            int t=arr[s];
            arr[s]=arr[ind];
            arr[ind]=t;

            heapifyDown(arr,s);
        }
    }
}