//Remove Duplicates from Sorted Array
//Optimal Approach-Two Pointers----T.C:O(N)------S.C:O(1)
package Amazon.Easy;

public class p2{
    public int removeDuplicates(int nums[]) {
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[i]<nums[j])
            {
                int t=nums[i+1];
                nums[i+1]=nums[j];
                nums[j]=t;
                i++;
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int nums[] = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        p1 sol = new p1();
        int k = sol.removeDuplicates(nums);
        System.out.println("Number of unique elements: " + k);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}