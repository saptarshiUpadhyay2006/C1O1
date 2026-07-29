//Search a 2D Matrix II(LC 240)

package GoldmanSachs.Med;

class p206{
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=0,col=matrix[0].length-1;
        while(row<matrix.length && col>=0)
        {
            if(matrix[row][col]==target)
            {
                System.out.println("found key at ("+row+","+col+")");
                return true;
            }
            else if(target< matrix[row][col])
            {
                col--;
            }
            else
            {
                row++;
            }
        }
        System.out.println("Key not found!");
        return false;
    }
 }
