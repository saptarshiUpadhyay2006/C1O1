//Jump Game II(LC 45)
//Greedy way

package GoldmanSachs.Med;

class p126{
    public int jump(int[] nums) {
        int c=0,curr=0,maxi=0;
        for(int i=0;i<nums.length-1;i++)
        {
            maxi=Math.max(maxi,i+nums[i]);
            if(i==curr)
            {
                c++;
                curr=maxi;
            }
        }
        return c;
    }
}