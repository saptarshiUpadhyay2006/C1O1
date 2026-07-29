//Valid Parenthesis String(LC 678)
//check using pointers

package GoldmanSachs.Med;

class p167{
    public boolean checkValidString(String s) {
        int l=0,h=0;
        for(char ch:s.toCharArray())
        {
            l+=(ch=='(')?1:-1;
            h+=(ch!=')')?1:-1;
            if(h<0)
            return false;
            l=Math.max(l,0);
        }
        return l==0;
    }
}