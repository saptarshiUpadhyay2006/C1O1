//Car Pooling(LC 1094)
//iterating & Capacity computing

package GoldmanSachs.Med;

class p52{
    public boolean carPooling(int[][] trips, int capacity) {
        int arr[]=new int[1001];
        for(int a[]:trips)
        {
            arr[a[1]]+=a[0];
            arr[a[2]]-=a[0];
        }
        for(int j=0;capacity>=0 && j<1001;j++)
        {
            capacity-=arr[j];
        }
        return capacity>=0;
    }
}