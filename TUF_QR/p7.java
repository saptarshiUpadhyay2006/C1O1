package TUF_QR;
import java.util.*;
class p7{
    public int reversePairs(int[] nums) {
        return mergeSort(nums,0,nums.length-1);
    }

    private int mergeSort(int nums[],int low,int high)
    {
        if(low>=high)
        return 0;

        int m=(low+high)/2;
        int c=0;
        c+=mergeSort(nums,low,m);
        c+=mergeSort(nums,m+1,high);
        c+=count(nums,low,m,high);
        merge(nums,low,m,high);

        return c;
    }

    private int count(int nums[],int low,int m,int high)
    {
        int r=m+1,c=0;
        for(int i=low;i<=m;i++)
        {
            while(r<=high && (long)nums[i]>2L*nums[r])
            r++;

            c+=(r-(m+1));
        }
        return c;
    }

    private void merge(int nums[],int l,int m,int h)
    {
        List<Integer> tm=new ArrayList<>();
        int lf=l,rg=m+1;
        while(lf<=m && rg<=h)
        {
            if(nums[lf]<=nums[rg])
            tm.add(nums[lf++]);
            else
            tm.add(nums[rg++]);
        }
        while(lf<=m)
        tm.add(nums[lf++]);
        while(rg<=h)
        tm.add(nums[rg++]);


        for(int i=l;i<=h;i++)
        nums[i]=tm.get(i-l);
    }
}