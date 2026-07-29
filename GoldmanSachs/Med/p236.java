//Split array largest sum(LC 410)

package GoldmanSachs.Med;

class p236{
    private int fac(int nums[],int p)
    {
        int n = nums.length;
        int s = 1;
        int ps = 0;
        for (int i = 0; i < n; i++) {
            if (ps + nums[i] <= p) {
                ps += nums[i];
            } else {
                s++;
                ps = nums[i];
            }
        }
        return s;
    }
    public int splitArray(int[] nums, int k) {
        int n = nums.length;
        if (k > n) 
        return -1;
        int l = Integer.MIN_VALUE;
        int h = 0;
        for(int i = 0; i < n; i++){
            l = Math.max(l, nums[i]);
            h = h + nums[i];
        }
        while (l <= h) {
            int mid = (l + h) / 2;
            int s = fac(nums, mid);
            if (s > k) {
                l = mid + 1;
            }
            else {
                h = mid - 1;
            }
        }
        return l;
    }
}
