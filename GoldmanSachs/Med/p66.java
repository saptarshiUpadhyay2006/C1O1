//N Queens(LC 51)
//using logic of Permutations III

package GoldmanSachs.Med;
import java.util.*;
class p66{
    List<List<String>> res = new ArrayList<>();
    public List<List<String>> solveNQueens(int n) {
        char board[][]=new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        find(board, 0, 0, 0, 0, n);
        return res;
    }

    public void find(char[][] board, int row, int cols, int diag1, int diag2, int n) {
        if(row==n)
        {
            List<String> list=new ArrayList<>();
            for(int i=0;i<n;i++)
                list.add(new String(board[i]));
            res.add(list);
            return;
        }
        for(int col=0;col<n;col++){
            int bit=1<<col;
            if((cols&bit)== 0&&(diag1&(1<<(row-col+n))) == 0 && (diag2&(1<<(row+col)))==0) {
                board[row][col]='Q';
                find(board,row+1,cols|bit,diag1|(1<<(row-col+n)),diag2|(1<<(row+col)),n);
                board[row][col] = '.'; 
            }
        }
    }
}