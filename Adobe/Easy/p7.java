//Remove Element(LC 27)
//Optimal Approach---Basic ops----T.C:O(n)------S.C:O(1)
//USING THE LC TEMPLATE

package Adobe.Easy;
class p7{
    public int removeElement(int[] nums, int val) {
        int i=0;
        for(int j=0;j<nums.length;j++)
        {
            if(nums[j]!=val)
            {
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }
}