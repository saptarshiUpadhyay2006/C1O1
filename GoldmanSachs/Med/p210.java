//Cherry Pickup(LC 741)
//3D Tabulation

package GoldmanSachs.Med;

class p210{
    Integer[][][] dp;
    public int solve(int[][] grid, int r1, int c1, int c2){
        int r2 = r1+c1-c2;
        if(r1>=grid.length || c1>=grid[0].length || r2>=grid.length || c2>=grid[0].length || grid[r1][c1]==-1 || grid[r2][c2]==-1) return Integer.MIN_VALUE; // invalid
        if((r1==grid.length-1 && c1==grid[0].length-1) || (r2==grid.length-1 && c2==grid[0].length-1)) return grid[r1][c1]; // last cell reached

        if(dp[r1][c1][c2]!=null) return dp[r1][c1][c2];

        int curr = (c1==c2? grid[r1][c1] : grid[r1][c1] + grid[r2][c2]); // current cherries on curr pos of robots

        int a = solve(grid, r1+1, c1, c2);
        int b = solve(grid, r1+1, c1, c2+1);
        int c = solve(grid, r1, c1+1, c2);
        int d = solve(grid, r1, c1+1, c2+1);

        int res = Integer.MIN_VALUE;
        if(a!=Integer.MIN_VALUE) res = Math.max(res, a+curr);
        if(b!=Integer.MIN_VALUE) res = Math.max(res, b+curr);
        if(c!=Integer.MIN_VALUE) res = Math.max(res, c+curr);
        if(d!=Integer.MIN_VALUE) res = Math.max(res, d+curr);

        return dp[r1][c1][c2] = res;
    }
    public int cherryPickup(int[][] grid) {
        dp = new Integer[grid.length][grid[0].length][grid[0].length];
        int res = solve(grid, 0, 0, 0);
        return res==Integer.MIN_VALUE? 0 : res; 
    }
}