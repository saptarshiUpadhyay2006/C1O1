//Word Search(LC 79)
//Optimal----traverse the 2D array and use dfs-----T.C:O(m.n.4^L)------S.C:O(L)
//USING THE LC TEMPLATE
package Google.Medium;

class p4{
    public boolean exist(char[][] board, String word) {
        int r=board.length,c=board[0].length;
        boolean b=false;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(dfs(board,i,j,word))
                return true;
            }
        }
        return false;
    }
    private boolean dfs(char arr[][],int i,int j,String word)
    {
        if(word.length()==0)
        return true;

        if(i<0||j<0||i>=arr.length||j>=arr[0].length||arr[i][j]=='.')
        return false;

        if(arr[i][j]==word.charAt(0))
        {
            boolean b=false;
            arr[i][j]='.';
            b=b||dfs(arr,i+1,j,word.substring(1));
            b=b||dfs(arr,i,j+1,word.substring(1));
            b=b||dfs(arr,i-1,j,word.substring(1));
            b=b||dfs(arr,i,j-1,word.substring(1));
            arr[i][j]=word.charAt(0);
            return b;
        }
        return false;
    }
}