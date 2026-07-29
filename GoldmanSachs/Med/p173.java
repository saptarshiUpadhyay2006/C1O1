//Find the duplicate number(LC 287)
//using slow and fast pointers in while loop

package GoldmanSachs.Med;

class p173{
    public int findDuplicate(int[] nums) {
        int s=nums[0],f=nums[0];
        do{
            s=nums[s];
            f=nums[nums[f]];
        }while(s!=f);

        s=nums[0];
        while(s!=f)
        {
            s=nums[s];
            f=nums[f];
        }
        return s;
    }
}