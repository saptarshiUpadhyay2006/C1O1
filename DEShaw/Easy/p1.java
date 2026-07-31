//Relative Sort Array(LC 1122)

package DEShaw.Easy;

class p1{
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int c1[]=new int[1001];
        for(int i:arr1)
            c1[i]++;

        int res[]=new int[arr1.length];
        int i=0;
        for(int n:arr2)
        {
            while(c1[n]>0)
            {
                res[i]=n;
                c1[n]--;
                i++;
            }
        }

        for(int j=0;j<c1.length;j++)
        {
            while(c1[j]>0)
            {
                res[i]=j;
                c1[j]--;
                i++;
            }
        }
        return res;
    }
}