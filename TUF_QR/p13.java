package TUF_QR;
import java.util.*;
class p13{
    public List<List<String>> solveNQueens(int n) {
        //your code goes here
        List<List<String>> arr=new ArrayList<>();
        List<String> curr=new ArrayList<>();
        for(int i=0;i<n;i++)
        curr.add(".".repeat(n));

        rec(0,arr,curr);
        return arr;
    }
    private void rec(int row,List<List<String>> arr,List<String> curr)
    {
        if(row==curr.size())
        {
            arr.add(new ArrayList<>(curr));
            return;
        }
        for(int c=0;c<curr.get(0).length();c++)
        {
            if(safe(curr,row,c))
            {
                char rowArr[]=curr.get(row).toCharArray();
                rowArr[c]='Q';
                curr.set(row,new String(rowArr));
                rec(row+1,arr,curr);
                rowArr[c]='.';
                curr.set(row,new String(rowArr));
            }
        }
    }
    private boolean safe(List<String> curr,int row,int col)
    {
        int r=row,c=col;
        while(r>=0 && c>=0)
        {
            if(curr.get(r).charAt(c)=='Q')
            return false;
            r--;
            c--;
        }
        r=row;
        c=col;
        while(r>=0)
        {
            if(curr.get(r).charAt(c)=='Q')
            return false;

            r--;
        }
        r=row;
        c=col;
        while(r>=0 && c<curr.get(0).length())
        {
            if(curr.get(r).charAt(c)=='Q')
            return false;
            r--;
            c++;
        }
        return true;
    }
}