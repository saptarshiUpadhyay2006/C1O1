//Excel sheet column number(LC 171)
//charcter mapping

package GoldmanSachs.Med;

class p186{
    public int titleToNumber(String columnTitle) {
        long res=0;
        for(int i=0;i<columnTitle.length();i++)
        {
            char ch=columnTitle.charAt(i);
            res=res*26+(ch-'A'+1);
        }
        return (int)res;
    }
}
