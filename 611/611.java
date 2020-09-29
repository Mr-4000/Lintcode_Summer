/**
 * Definition for a point.
 * class Point {
 *     int x;
 *     int y;
 *     Point() { x = 0; y = 0; }
 *     Point(int a, int b) { x = a; y = b; }
 * }
 */

public class Solution {
    /**
     * @param grid: a chessboard included 0 (false) and 1 (true)
     * @param source: a point
     * @param destination: a point
     * @return: the shortest path 
     */
    public int shortestPath(boolean[][] grid, Point source, Point destination) {
        // write your code here
        int n = grid.length;
        if (n==0) {
            return -1;
        }
        int m = grid[0].length;
        int[][] map = new int[n][m];
        map[source.x][source.y]=1;
        int fl=1,step=1;
        while (fl==1) {
            fl=0;
            for (int i=0;i<n;i++) {
                for (int j=0;j<m;j++) {
                    if (map[i][j]==step) {
                        fl=1;
                        knight(map,i,j,step,grid);
                    }
                }
            }
            if (map[destination.x][destination.y]!=0) {
                return map[destination.x][destination.y]-1;
            }
            step++;
        }
        System.out.println(map[destination.x][destination.y]);
        return -1;
        
    }
    
    private void knight(int[][] map,int i,int j,int step,boolean[][] grid) {
        int n=grid.length,m=grid[0].length;
        if ((i+1<n)&&(j+2<m)&&(map[i+1][j+2]==0)&&(!grid[i+1][j+2])) {
            map[i+1][j+2] = step + 1;
        }
        if ((i+1<n)&&(j-2>=0)&&(map[i+1][j-2]==0)&&(!grid[i+1][j-2])) {
            map[i+1][j-2] = step + 1;
        }
        if ((i-1>=0)&&(j+2<m)&&(map[i-1][j+2]==0)&&(!grid[i-1][j+2])) {
            map[i-1][j+2] = step + 1;
        }
        if ((i-1>=0)&&(j-2>=0)&&(map[i-1][j-2]==0)&&(!grid[i-1][j-2])) {
            map[i-1][j-2] = step + 1;
        }
        if ((i+2<n)&&(j+1<m)&&(map[i+2][j+1]==0)&&(!grid[i+2][j+1])) {
            map[i+2][j+1] = step + 1;
        }
        if ((i+2<n)&&(j-1>=0)&&(map[i+2][j-1]==0)&&(!grid[i+2][j-1])) {
            map[i+2][j-1] = step + 1;
        }
        if ((i-2>=0)&&(j+1<m)&&(map[i-2][j+1]==0)&&(!grid[i-2][j+1])) {
            map[i-2][j+1] = step + 1;
        }
        if ((i-2>=0)&&(j-1>=0)&&(map[i-2][j-1]==0)&&(!grid[i-2][j-1])) {
            map[i-2][j-1] = step + 1;
        }
    }
}