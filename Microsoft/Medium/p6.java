//Generate parentheses(LC 22)
//Optimal----Recursive Approach-----T.C:O(4ⁿ/√n)------S.C:O(n·4ⁿ/√n)
//USING THE LC TEMPLATE

package Microsoft.Medium;
import java.util.*;

class p6{
    public List<String> generateParenthesis(int n) {
        List<String> arr=new ArrayList<>();
        int oc=0,cc=0;
        String str="";
        fac(arr,oc,cc,str,n);
        return arr;
    }
    private void fac(List<String> arr,int oc,int cc,String str,int n)
    {
        if(oc==n && cc==n)
        arr.add(str);
        else
        {
            if(oc>cc)
            fac(arr,oc,cc+1,str+")",n);
            if(oc<n)
            fac(arr,oc+1,cc,str+"(",n);
        }
    }
}