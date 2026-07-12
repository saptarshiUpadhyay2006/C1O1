//Sort colors(LC 75)
//Optimal-----computation----T.C:O(n)------S.C:O(1)
//USING THE LC TEMPLATE
package Adobe.Medium;
import java.util.*;

class p11{
    public void sortColors(int[] nums) {
        int l=0,m=0,h=nums.length-1;
        while(m<=h)
        {
            switch(nums[m])
            {
                case 0:
                    swap(nums,l++,m++);
                    break;
                case 1:
                    m++;
                    break;
                case 2:
                    swap(nums,m,h--);
                    break;
            }
        }
    }

    private static void swap(int nums[],int i,int j)
    {
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
}