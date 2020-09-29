public class Solution {
    /**
     * @param obstacleGrid: A list of lists of integers
     * @return: An integer
     */
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // write your code here
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] map = new int[m][n];
        if (obstacleGrid[0][0]==1) {
            return 0;
        }
        map[0][0] = 1;
        for (int i=1;i<m;i++) {
            if (obstacleGrid[i][0]!=1) {
                map[i][0] = map[i-1][0];
            }
            else {
                map[i][0] = 0;
            }
        }
        for (int i=1;i<n;i++) {
            if (obstacleGrid[0][i]!=1) {
                map[0][i] = map[0][i-1];
            }
            else {
                map[0][i] = 0;
            }
        }
        for (int i=1;i<m;i++) {
            for (int j=1;j<n;j++) {
                if (obstacleGrid[i][j]!=1) {
                    map[i][j] = map[i-1][j] + map[i][j-1];
                }
                else {
                    map[i][j] = 0;
                }
            }
        }
        return map[m-1][n-1];
    }
}