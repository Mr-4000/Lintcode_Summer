public class Solution {
    /**
     * @param n: An integer
     * @return: An Integer
     */
    public int climbStairs2(int n) {
        // write your code here
        int[] dp = new int[n+1];
        if (n==0) {
            return 1;
        }
        dp[0]=1;
        if (n==1) {
            return 1;
        }
        dp[1] = 1;
        if (n==2) {
            return 2;
        }
        dp[2] = 2;
        for (int i=3;i<=n;i++) {
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }
        return dp[n];
    }
}