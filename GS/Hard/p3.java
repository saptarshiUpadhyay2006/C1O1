//Last substring in lexicographical order(LC 1163)
//Optimal Approach----T.C:O(n^2)------S.C:O(1)
//USING THE LC TEMPLATE
package GS.Hard;

class p3{
    public String lastSubstring(String s) {
        int mi=s.length()-1;
        for(int curr=s.length()-1;curr>=0;curr--)
        {
            if(s.charAt(curr)>s.charAt(mi))
            mi=curr;
            else if(s.charAt(curr)==s.charAt(mi))
            {
                int i=curr+1;
                int j=mi+1;
                while(i<mi && j<s.length() && s.charAt(i)==s.charAt(j))
                {
                    i++;
                    j++;
                }
                if(i==mi||j==s.length()||s.charAt(i)>s.charAt(j))
                mi=curr;
            }
        }
        return s.substring(mi);
    }
}