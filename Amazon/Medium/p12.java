//find good days to rob the bank(LC 2100)
//Optimal Approach----T.C:O(n)------S.C:O(1)
//USING THE LC TEMPLATE
package Amazon.Medium;
import java.util.*;
class p12{
    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        int sz=security.length,cnt=0;
        int pre[]=new int[sz];
        int suf[]=new int[sz];

        for(int i=1;i<sz;i++)
        {
            if(security[i]<=security[i-1])
            cnt++;
            else
            cnt=0;

            pre[i]=cnt;
        }
        cnt=0;
        for(int i=sz-2;i>=0;i--)
        {
            if(security[i]<=security[i+1])
            cnt++;
            else
            cnt=0;

            suf[i]=cnt;
        }
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<sz;i++)
        {
            if(pre[i]>=time && suf[i]>=time)
            arr.add(i);
        }
        return arr;
    }
}