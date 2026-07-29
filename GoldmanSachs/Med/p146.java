//Spiral matrix II(LC 59)
//using row & col end start pointers

package GoldmanSachs.Med;

class p146{
    public int[][] generateMatrix(int n) {
        int arr[][]=new int[n][n];
        if(n==0)
        return arr;
        int rs=0,re=n-1,cs=0,ce=n-1;
        int num=1;

        while(rs<=re && cs<=ce)
        {
            for(int i=cs;i<=ce;i++)
            {
                arr[rs][i]=num++;
            }
            rs++;
            for(int i=rs;i<=re;i++)
            arr[i][ce]=num++;

            ce--;

            for(int i=ce;i>=cs;i--)
            {
                if(rs<=re)
                arr[re][i]=num++;
            }
            re--;

            for(int i=re;i>=rs;i--)
            {
                if(cs<=ce)
                arr[i][cs]=num++;
            }
            cs++;
        }
        return arr;
    }
}