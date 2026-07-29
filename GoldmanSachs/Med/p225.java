//Reverse words in a string(LC 151)
//Use stringbuilder ops

package GoldmanSachs.Med;

class p225{
    public String reverseWords(String s) {
        int n=s.length();
        int i=0;
        StringBuilder sb=new StringBuilder();
        String arr[]=new String[n];
        int idx=0;
        while(i<n)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            {
                sb.append(ch);
            }
            if(ch==' ' && sb.length()>0)
            {
                arr[idx]=sb.toString();
                idx++;
                sb.setLength(0);
            }
            i++;
        }
        if(sb.length() > 0)
        {
            arr[idx] = sb.toString();
            idx++;
        }
        StringBuilder sb2=new StringBuilder();
        for(int j=idx-1;j>=0;j--)
        {
            sb2.append(arr[j]);
            if(j!=0)
            sb2.append(" ");
        }
        return (sb2.toString());
    }
}