//Valid Palindrome(LC 1864)
//Optimal Approach------T.C:O(n)------S.C:O(n)
//USING THE LC TEMPLATE

package Microsoft.Easy;
import java.util.*;

class p4{
    public String defangIPaddr(String address) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<address.length();i++)
        {
            if(address.charAt(i)=='.')
            sb.append("[.]");
            else
            sb.append(address.charAt(i));
        }
        return sb.toString();
    }
}