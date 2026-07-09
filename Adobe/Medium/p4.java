//No of laser beams in bank(LC 2125)
//Optimal-----Compare and Match----T.C:O(n.m)------S.C:O(m)
//USING THE LC TEMPLATE
package Adobe.Medium;
import java.util.*;

class p4{
    public int numberOfBeams(String[] bank) {
        List<Integer> arr=new ArrayList<>();
        for(String i:bank)
        {
            int c=(int)i.chars().filter(ch->ch=='1').count();
            if(c!=0)
            arr.add(c);
        }
        int s=0;
        if(arr.size()<=1)
        return 0;

        for(int i=0;i<arr.size()-1;i++)
        s+=arr.get(i)*arr.get(i+1);

        return s;
    }
}