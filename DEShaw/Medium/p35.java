//Construct smallest number from DI String(LC 2375)
//stringbuilder ops

package DEShaw.Medium;

class p35{
    public String smallestNumber(String pattern) {
        StringBuilder sb=new StringBuilder();
        StringBuilder s=new StringBuilder();
        for(int i=0;i<=pattern.length();i++)
        {
            s.append((char)('1'+i));
            if(i==pattern.length()||pattern.charAt(i)=='I')
            {
                sb.append(s.reverse());
                s=new StringBuilder();
            }
        }
        return sb.toString();
    }
}