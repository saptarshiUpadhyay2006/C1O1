//Minm time to visit a cell in a grid(LC 2577)
//Optimal---------T.C:O(n.m)------S.C:O(n.m)
//USING THE LC TEMPLATE

package Atlassian.Hard;
import java.util.*;
class Solution {
    public int minimumTime(int[][] grid) {
        int n = grid.length, m = grid[0].length;

        if (n > 1 && m > 1 && grid[0][1] > 1 && grid[1][0] > 1)
            return -1;

        int[][] dist = new int[n][m];
        for (int[] row : dist)
            Arrays.fill(row, Integer.MAX_VALUE);

        dist[0][0] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
        pq.offer(new int[]{0, 0, 0});

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, 1, -1};

        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int wt = cur[0], x = cur[1], y = cur[2];

            if (wt > dist[x][y])
                continue;

            if (x == n - 1 && y == m - 1)
                return wt;

            for (int k = 0; k < 4; k++) {
                int nx = x + dx[k];
                int ny = y + dy[k];

                if (nx < 0 || nx >= n || ny < 0 || ny >= m)
                    continue;

                int nt = wt + 1;

                if (nt < grid[nx][ny]) {
                    int diff = grid[nx][ny] - nt;
                    nt = (diff % 2 == 0) ? grid[nx][ny] : grid[nx][ny] + 1;
                }

                if (nt < dist[nx][ny]) {
                    dist[nx][ny] = nt;
                    pq.offer(new int[]{nt, nx, ny});
                }
            }
        }

        return -1;
    }
}