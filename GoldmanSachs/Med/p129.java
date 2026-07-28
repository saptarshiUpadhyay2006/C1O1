//Word search(LC 79)
//Using dfs

package GoldmanSachs.Med;

class p129{
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