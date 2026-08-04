package TUF_QR;

class p8{
    public boolean searchInARotatedSortedArrayII(int[] nums, int k) {
      int n=nums.length;
      for(int i=0;i<n;i++)
      {
        if(nums[i]==k)
        return true;
      }
      return false;
    }
}