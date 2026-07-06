//Palindrome no.(LC 1864)
//Optimal Approach--Count no. of -ve el--T.C:O(n)------S.C:O(1)
//USING THE LC TEMPLATE

package Microsoft.Easy;

class p2{
    public int arraySign(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            return 0;
            else if(nums[i]<0)
            c++;

        }
        if(c%2==1)
        return -1;
        else
        return 1;
    }
}