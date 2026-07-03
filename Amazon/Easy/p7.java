//Missing Number(LC 268)
//Optimal Approach---XOR Approach----T.C:O(nlogn)------S.C:O(logn)
//USING THE LC TEMPLATE
package Amazon.Easy;
import java.util.*;

class p7{
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