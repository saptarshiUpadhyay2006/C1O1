package TUF_QR;

class p5{
    public int[] findMissingRepeatingNumbers(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n+1];
        for(int i=0;i<n;i++)
        arr[nums[i]]++;

        int r=-1,m=-1;
        for(int i=1;i<=n;i++)
        {
            if(arr[i]==0)
            m=i;
            else if(arr[i]==2)
            r=i;
        }
        return new int[]{r,m};
    }
}