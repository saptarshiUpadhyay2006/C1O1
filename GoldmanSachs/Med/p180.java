//Sudoku solver(LC 37)

package GoldmanSachs.Med;

class p180{
    public void solveSudoku(char[][] board) {
        bt(board);
    }

    private boolean bt(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    for (char ch = '1'; ch <= '9'; ch++) {
                        if (is(board, i, j, ch)) {
                            board[i][j] = ch;
                            if (bt(board)) {
                                return true;
                            }
                            board[i][j] = '.'; 
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    private boolean is(char[][] board, int row, int col, char ch) {
        for (int j = 0; j < 9; j++) {
            if (board[row][j] == ch) return false;
        }
        for (int i = 0; i < 9; i++) {
            if (board[i][col] == ch) return false;
        }
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == ch) return false;
            }
        }
        return true;
    }
}