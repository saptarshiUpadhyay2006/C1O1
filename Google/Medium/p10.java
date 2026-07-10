//Longest Increading Path(LC 329)
//Optimal-----Use BFS----T.C:O(n.m)------S.C:O(n.m)
//USING THE LC TEMPLATE
package Google.Medium;
import java.util.*;

class p10{
    public int longestIncreasingPath(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int dirs[][]={{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        int indegree[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                for(int dir[]:dirs){
                    int nx=i+dir[0];
                    int ny=j+dir[1];
                    if(nx>=0&&nx<m&&ny>=0&&ny<n){
                        if(matrix[nx][ny]>matrix[i][j]){
                            indegree[nx][ny]++;
                        }
                    }
                }
            }
        }
        Queue<int[]> queue=new LinkedList<>();
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if(indegree[i][j]==0){
                    queue.add(new int[]{i, j});
                }
            }
        }
        int length=0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int cur[]= queue.poll();
                int x=cur[0];
                int y=cur[1];
                for (int dir[]:dirs) {
                    int nx=x+dir[0];
                    int ny=y+dir[1];
                    if (nx >= 0 && nx < m && ny >= 0 && ny < n) {
                        if (matrix[x][y] < matrix[nx][ny]) {
                            indegree[nx][ny]--;
                            if (indegree[nx][ny] == 0) {
                                queue.offer(new int[]{nx, ny});
                            }
                        }
                    }
                }
            }
            length++;
        }
        return length;
    }
}