//Valid Triangle number(LC 611)
//checking on iter.

package GoldmanSachs.Med;
import java.util.*;
class p114{
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int c=0;
        for (int k=n-1;k>=2;k--){
            int i=0,j=k-1;
            while(i<j){
                if(nums[i]+nums[j]>nums[k]){
                    c+=(j-i);
                    j--;
                }
                else 
                i++;
            }
        }
        return c;
    }
}