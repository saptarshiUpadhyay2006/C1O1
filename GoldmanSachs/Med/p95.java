//Circular Array Loop(LC 457)
//dfs approach

package GoldmanSachs.Med;

class p95{
    public boolean circularArrayLoop(int[] nums) {
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(arr[i]==0 && dfs(nums,arr,i))
            return true;
        }
        return false;
    }
    private boolean dfs(int nums[],int arr[],int st)
    {
        if(arr[st]==2)
        return false;
        arr[st]=1;
        int n=st+nums[st];
        n=n%nums.length+nums.length;
        n%=nums.length;
        if(n==st||nums[n]*nums[st]<0)
        {
            arr[st]=2;
            return false;
        }
        if(arr[n]==1)
        {
            arr[st]=2;
            return true;
        }
        if(dfs(nums,arr,n))
        return true;
        arr[st]=2;
        return false;
    }
}
