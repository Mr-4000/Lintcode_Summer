public class Solution {
    /**
     * @param matrix: matrix, a list of lists of integers
     * @param target: An integer
     * @return: a boolean, indicate whether matrix contains target
     */
    public boolean searchMatrix(int[][] matrix, int target) {
        // write your code here
        if ((matrix.length == 0)||(matrix[0].length == 0)) {
            return false;
        }
        int l,r,m,n;
        n = matrix.length;
        l = 0;
        r = n-1;
        if ((matrix[0][0]>target)||(matrix[r][matrix[0].length-1])<target) {
            return false;
        }
        while (l<=r) {
            m = l + (r - l) / 2;
            if (matrix[m][0] == target) {
                return true;
            }
            if (matrix[m][0] > target) {
                r = m-1;
            }
            if (matrix[m][0] < target) {
                if (m==n-1) {
                    l = m;
                    break;
                }
                if (matrix[m+1][0] <= target) {
                    l = m + 1;
                }
                else {
                    l = m;
                    break;
                }
            }
        }
        n = matrix[l].length;
        r = n-1;
        n = l;
        l = 0;
        if (matrix[n][r] < target) {
            return false;
        }
        while (l<=r) {
            m = l + (r - l) / 2;
            if (matrix[n][m] == target) {
                return true;
            }
            if (matrix[n][m] > target) {
                r = m - 1;
            }
            if (matrix[n][m] < target) {
                l = m + 1;
            }
        }
        return false;

    }
}