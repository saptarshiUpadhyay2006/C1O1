//kth smallest number in multiplication table(LC 668)

package DEShaw.Hard;

class p11{
    public int findKthNumber(int m, int n, int k) {
        int l=0,h=m*n;
        while(l<h)
        {
            int mid=(l+h)/2;
            int c=0;
            for(int i=1;i<=m;i++)
            c+=n<mid/i?n:mid/i;
            if(c>=k)
            h=mid;
            else
            l=mid+1;
        }
        return l;
    }
}