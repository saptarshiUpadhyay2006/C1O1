//Maxm avg subarray I(LC 643)

package GoldmanSachs.Med;

class p212{
    public double findMaxAverage(int[] nums, int k) {
        int s=0;
        for(int i=0;i<k;i++)
        {
            s+=nums[i];
        }
        int maxi=s;
        for(int i=k;i<nums.length;i++)
        {
            s+=nums[i]-nums[i-k]; 
            maxi=Math.max(maxi,s);
        }

        return (double) maxi/k;
    }
}