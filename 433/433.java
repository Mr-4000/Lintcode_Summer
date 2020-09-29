public class Solution {
    /**
     * @param grid: a boolean 2D matrix
     * @return: an integer
     */
    public int numIslands(boolean[][] grid) {
        // write your code here
        int sum=0,i,j;
        int m = grid.length;
        if (m==0) {
            return 0;
        }
        int n = grid[0].length;
        for (i=0;i<m;i++) {
            for (j=0;j<n;j++) {
                if (grid[i][j]) {
                    sum++;
                    findIslands(grid,i,j);
                }
            }
        }
        return sum;
    }
    
    private void findIslands(boolean[][] grid,int i,int j) {
        grid[i][j]=false;
        int m = grid.length;
        int n = grid[0].length;
        if ((i>0)&&(grid[i-1][j])) {
            findIslands(grid,i-1,j);
        }
        if ((j>0)&&(grid[i][j-1])) {
            findIslands(grid,i,j-1);
        }
        if ((i<m-1)&&(grid[i+1][j])) {
            findIslands(grid,i+1,j);
        }
        if ((j<n-1)&&(grid[i][j+1])) {
            findIslands(grid,i,j+1);
        }
    }
}