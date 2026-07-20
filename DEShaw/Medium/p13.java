//Maximize no. of subseq after one inseting(LC 3628)
//Optimal----Greedy Approach-----T.C:O(nlogM)------S.C:O(1)
//USING THE LC TEMPLATE

package DEShaw.Medium;

class p13{
    public long numOfSubsequences(String s) {
        int n=s.length();
        long pre[]=new long[n+1];
        long suf[]=new long[n+1];

        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='L')
            pre[i+1]=1;
            
            pre[i+1]+=pre[i];
        }
        for(int i=n-1;i>=0;i--)
        {
            if(s.charAt(i)=='T')
            suf[i]=1;

            suf[i]+=suf[i+1];
        }
        long rwc=0,bpfc=0,rwl=0,rwt=0;

        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)=='C')
            {
                rwc+=pre[i]*suf[i+1];
                rwl+=(pre[i]+1)*suf[i+1];
                rwt+=pre[i]*(suf[i+1]+1);
            }
            else
            bpfc=Math.max(pre[i]*suf[i],bpfc);
        }
        rwc+=bpfc;
        return Math.max(rwl,Math.max(rwt,rwc));
    }
}