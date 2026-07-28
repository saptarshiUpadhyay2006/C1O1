//Decode String(LC 394)
//using dfs

package GoldmanSachs.Med;

class p134{
    int i=0;
    public String decodeString(String s) {
        i=0;
        return dfs(s);
    }
    private String dfs(String s)
    {
        StringBuilder sb=new StringBuilder();
        int num=0;
        while(i<s.length())
        {
            char ch=s.charAt(i);
            if(Character.isDigit(ch))
            {
                num=num*10+(ch-'0');
                i++;
            }
            else if(ch=='[')
            {
                i++;
                String in=dfs(s);
                for(int k=0;k<num;k++)
                sb.append(in);
                num=0;
            }
            else if(ch==']')
            {
                i++;
                return sb.toString();
            }
            else
            {
                sb.append(ch);
                i++;
            }
        }
        return sb.toString();
    }
}
