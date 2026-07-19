//Maxm width ramp(LC 962)
//Optimal--------T.C:O(n)------S.C:O(n)
//USING THE LC TEMPLATE

package DEShaw.Medium;

class p8{
    public int maxWidthRamp(int[] nums) {
        int arr[]=new int[nums.length];
        arr[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--)
        arr[i]=Math.max(nums[i],arr[i+1]);

        int l=0,r=0,rm=0;
        while(r<nums.length)
        {
            while(l<r && nums[l]>arr[r])
            l++;
            rm=Math.max(rm,r-l);
            r++;
        }
        return rm;
    }
}