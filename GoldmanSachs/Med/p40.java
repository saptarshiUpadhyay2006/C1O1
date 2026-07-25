//Successful pairs of spells & Potions(LC 2300)
//Use binary search & brute will give TLE

package GoldmanSachs.Med;
import java.util.*;
class p40{
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n=spells.length;
        int m=potions.length;
        int arr[]=new int[n];
        Arrays.sort(potions);
        for(int i=0;i<n;i++)
        {
            int l=0,r=m-1;
            int idx=m;
            while(l<=r){
                int mid=l+(r-l)/2;
                if((long)spells[i]*potions[mid]>=success){
                    idx=mid;
                    r=mid - 1;
                } 
                else 
                {
                    l=mid+1;
                }
            }
            arr[i]=m-idx;
        }
        return arr;
    }
}