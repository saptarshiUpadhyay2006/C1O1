//Missing number(LC 268)
//Use bitwise op

package GoldmanSachs.Med;

class p172{
    public int missingNumber(int[] nums) {
        int x=nums.length;
        for(int i=0;i<nums.length;i++)
        {
            x=x^i;
            x=x^nums[i];
        }
        return x;
    }
}