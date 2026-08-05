package TUF_QR;
import java.util.*;
class p17{
    public int longestNonRepeatingSubstring(String s) {
        //your code goes here
        int n=s.length();
        int l=0,r=0,maxi=0;
        int arr[]=new int[256];
        Arrays.fill(arr,-1);
        while(r<n)
        {
            if(s.charAt(r)!=1)
            l=Math.max(arr[s.charAt(r)]+1,l);
        
            int len=r-l+1;
            maxi=Math.max(maxi,len);
            arr[s.charAt(r)]=r;
            r++;
        }
        return maxi;
    }
}