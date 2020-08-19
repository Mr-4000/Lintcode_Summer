public class Solution {
    /**
     * @param s: the maximum length of s is 1000
     * @return: the longest palindromic subsequence's length
     */
    public int longestPalindromeSubseq(String s) {
        if (s.length()==0) {
            return 0;
        }
        // write your code here
        int n=s.length(),i,j;
        int[][] dp = new int[n][n];
        for (i=0;i<n;i++) {
            dp[i][i] = 1;
        }
        for (i=n-2;i>=0;i--) {
            for (j=i+1;j<n;j++) {
                if (s.charAt(i)==s.charAt(j)) {
                    dp[i][j] = dp[i+1][j-1] + 2;
                }
                else {
                    dp[i][j] = Math.max(dp[i+1][j],dp[i][j-1]);
                }
            }
        }
        return dp[0][n-1];
    }
}