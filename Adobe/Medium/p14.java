//Valid Sudoku(LC 36)
//Optimal----Using HashSet Approach----T.C:O(1)------S.C:O(1)
//USING THE LC TEMPLATE

package Adobe.Medium;
import java.util.*;
class p14{
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> rs[]=new HashSet[9];
        HashSet<Character> cs[]=new HashSet[9];
        HashSet<Character> bs[]=new HashSet[9];
        for(int i=0;i<9;i++)
        {
            rs[i]=new HashSet<>();
            cs[i]=new HashSet<>();
            bs[i]=new HashSet<>();
        }
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                char ch=board[i][j];
                if(ch=='.')
                continue;

                if(rs[i].contains(ch)||cs[j].contains(ch)||bs[(i/3)*3+(j/3)].contains(ch))
                return false;

                rs[i].add(ch);
                cs[j].add(ch);
                bs[(i/3)*3+(j/3)].add(ch);
            }
        }
        return true;
    }
}