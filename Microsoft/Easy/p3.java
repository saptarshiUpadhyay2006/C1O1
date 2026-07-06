//Valid Palindrome(LC 1864)
//Optimal Approach--Basic op--T.C:O(n)------S.C:O(1)
//USING THE LC TEMPLATE

package Microsoft.Easy;
import java.util.*;

class p3{
    public boolean isPalindrome(String s) {
        int st=0;
        int l=s.length()-1;
        while(st<=l)
        {
            if(!Character.isLetterOrDigit(s.charAt(st)))
            st++;
            else if(!Character.isLetterOrDigit(s.charAt(l)))
            l--;
            else if(Character.toLowerCase(s.charAt(st))!=Character.toLowerCase(s.charAt(l)))
            return false;
            else{
                st++;
                l--;
            }
        }
        return true;

    }
}