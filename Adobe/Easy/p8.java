//Length of last word(LC 58)
//Optimal Approach---Traversal from last----T.C:O(n)------S.C:O(1)
//USING THE LC TEMPLATE

package Adobe.Easy;

class p8{
    public int lengthOfLastWord(String s) {
        int c=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            char ch=s.charAt(i);
            if(ch!=' ')
            c++;
            else 
            {
                if(c>0)
                return c;
            }
        }
        return 0;
    }
}