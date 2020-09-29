public class Solution {
    /**
     * @param grid: a chessboard included 0 and 1
     * @return: the shortest path
     */
    public class pos {
        int x;
        int y;
        pos(int a,int b) {
            x = a;
            y = b;
        }
    }
    public int shortestPath2(boolean[][] grid) {
        // write your code here
        int[] x_direct = {1,-1,2,-2};
        int[] y_direct = {2,2,1,1};
        int n=grid.length;
        int m=grid[0].length;
        int[][] map=new int[n][m];
        map[0][0] = 0;
        Queue<pos> q = new LinkedList();
        q.offer(new pos(0,0));
        while(!q.isEmpty()) {
            pos temp = q.poll();
            for (int i=0;i<4;i++) {
                int x = temp.x+x_direct[i];
                int y = temp.y+y_direct[i];
                if ((x<0)||(x>=n)) {
                    continue;
                }
                if ((y<0)||(y>=m)) {
                    continue;
                }
                if ((grid[x][y]!=true)&&(map[x][y]==0)) {
                    map[x][y] = map[temp.x][temp.y] + 1;
                    q.offer(new pos(x,y));
                }
            }
        }
        if (map[n-1][m-1]==0) {
            return -1;
        }
        else {
            return map[n-1][m-1];
        }
    }
}