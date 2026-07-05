//Product of array except self(LC 238)
//Optimal----Prefix Suffix Method-----T.C:O(n)------S.C:O(1)
//USING THE LC TEMPLATE
package GS.Medium;

class p5{
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int pre[]=new int[n];
        int suf[]=new int[n];
        int arr[]=new int[n];
        pre[0]=1;
        suf[n-1]=1;
        for(int i=1;i<n;i++)
        pre[i]=pre[i-1]*nums[i-1];

        for(int i=n-2;i>=0;i--)
        suf[i]=suf[i+1]*nums[i+1];

        for(int i=0;i<n;i++)
        arr[i]=pre[i]*suf[i];
        return arr;
    }
}