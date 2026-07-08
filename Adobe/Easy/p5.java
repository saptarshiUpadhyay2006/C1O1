//Reverse String II(LC 541)
//Optimal Approach---Basic ops with manipulation----T.C:O(n)------S.C:O(n)
//USING THE LC TEMPLATE

package Adobe.Easy;

class p5{
    public String reverseStr(String s, int k) {
       int l=0,r=Math.min(k,s.length());
       char arr[]=s.toCharArray();
       while(l<s.length())
       {
        rev(arr,l,r);
        l=l+2*k;
        r=Math.min(l+k,s.length());
       } 
       return new String(arr);
    }
    private static void rev(char arr[],int l,int r)
    {
        while(l<r)
        {
            char t=arr[l];
            arr[l]=arr[r-1];
            arr[r-1]=t;
            l++;
            r--;
        }
    }
}