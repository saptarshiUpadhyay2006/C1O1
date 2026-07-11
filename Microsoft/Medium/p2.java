//Next Permutation(LC 31)
//Optimal----start iterating from right side to get the next permutation----T.C:O(n)------S.C:O(1)
//USING THE LC TEMPLATE

package Microsoft.Medium;

class p2{
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int i=n-2;
        while(i>=0 && nums[i]>=nums[i+1])
        {
            i--;
        }
        if(i<0)
        rev(nums,0,n-1);
        else
        {
            int j=n-1;
            while(nums[j]<=nums[i])
            j--;
            swap(nums,i,j);
            rev(nums,i+1,n-1);
        }
    }
    private void rev(int nums[],int i,int j)
    {
        while(i<=j)
        {
            swap(nums,i,j);
            i++;
            j--;
        }
    }
    private void swap(int nums[],int i,int j)
    {
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
}