package TUF_QR;

class p11{
    public double median(int[] arr1, int[] arr2) {
        int n1=arr1.length,n2=arr2.length;
        int arr[]=new int[n1+n2];
        int i=0,j=0,k=0;
        while(i<n1 && j<n2)
        {
            if(arr1[i]<arr2[j])
            arr[k++]=arr1[i++];
            else
            arr[k++]=arr2[j++];
        }
        while(i<n1)
        arr[k++]=arr1[i++];
        while(j<n2)
        arr[k++]=arr2[j++];

        int n=n1+n2;
        if(n%2==1)
        return (double)arr[n/2];
        double m=((double)arr[n/2]+(double)arr[(n/2)-1])/2.0;
        return m;
    }
}