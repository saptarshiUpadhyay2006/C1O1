//Minm window substring(LC 76)
//using a freq hash table

package GoldmanSachs.Med;

class p122{
    public String minWindow(String s, String t) {
        int fq[]=new int[128];
        for(char ch:t.toCharArray())
        fq[ch]++;

        int l=0,n=t.length();
        int st=0,mini=Integer.MAX_VALUE;

        for(int r=0;r<s.length();r++)
        {
            if(fq[s.charAt(r)]>0)
            n--;
            fq[s.charAt(r)]--;
            while(n==0)
            {
                if(r-l+1<mini)
                {
                    mini=r-l+1;
                    st=l;
                }
                fq[s.charAt(l)]++;
                if(fq[s.charAt(l)]>0)
                n++;

                l++;
            }
        }
        return mini==Integer.MAX_VALUE?"":s.substring(st,st+mini);
    }
}