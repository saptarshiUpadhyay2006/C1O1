package TUF_QR;
import java.util.*;
class p43{
    public List<Integer> search(String text, String pattern) {
        String s=pattern+'$'+text;
        int Z[]=ZArray(s);
        int n=text.length(),m=pattern.length();
        List<Integer> arr=new ArrayList<>();
        for(int i=m+1;i<s.length();i++)
        {
            if(Z[i]==m)
            arr.add(i-(m+1));
        }
        return arr;
    }
    private int[] ZArray(String s) {
        int n = s.length();
        int[] Z = new int[n];
        int left = 0, right = 0;
        for(int i = 1; i < n; i++) {
            if(i > right) {
                while(i + Z[i] < n && s.charAt(i + Z[i]) == s.charAt(Z[i])) {
                    Z[i]++;
                }
            }

            else {
                if(i + Z[i - left] <= right) {
                    Z[i] = Z[i - left];
                }
                else {
                    Z[i] = right - i + 1;
                    while(i + Z[i] < n && s.charAt(i + Z[i]) == s.charAt(Z[i])) {
                        Z[i]++;
                    }
                }
            }
            if(i + Z[i] - 1 > right) {
                left = i;
                right = i + Z[i] - 1;
            }
        }
        return Z;
    }
}