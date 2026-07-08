//minimum window substring(LC 76)
//Optimal----Use map and 2 pointer app-----T.C:O(n)------S.C:O(n)
//USING THE LC TEMPLATE
package GS.Medium;

class p6{
    public String minWindow(String s, String t) {
        if(s==null||t==null||s.length()==0||t.length()==0||s.length()<t.length())
        return new String();

        int mp[]=new int[128];
        int c=t.length(),st=0,e=0,mini=Integer.MAX_VALUE,si=0;
        for(char ch:t.toCharArray())
        mp[ch]++;

        char arr[]=s.toCharArray();
        while(e<arr.length)
        {
            if(mp[arr[e++]]-->0)
            c--;
            while(c==0)
            {
                if(e-st<mini)
                {
                    si=st;
                    mini=e-st;
                }
                if(mp[arr[st++]]++==0)
                c++;
            }
        }
        return mini==Integer.MAX_VALUE?new String():new String(arr,si,mini);
    }
}