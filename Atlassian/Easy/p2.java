//Single Number(LC 136)
//Optimal-----XOR of all-----T.C:O(n)------S.C:O(1)
//USING THE LC TEMPLATE
package Atlassian.Easy;

class p2{
    public int singleNumber(int[] nums) {
        int s=0;
        for(int i=0;i<nums.length;i++)
        s^=nums[i];
        return s;
    }
}