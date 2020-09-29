public class Solution {
    /**
     * @param A: An array of Integer
     * @return: an integer
     */
    public int longestIncreasingContinuousSubsequence(int[] A) {
        // write your code here
        int n = A.length;
        int[] dp = new int[n];
        if (n==0) {
            return  0;
        }
        if (n==1) {
            return 1;
        }
        if (n==2) {
            return 2;
        }
        dp[0] = 1;
        dp[1] = 2;
        int max=2;
        for (int i=2;i<n;i++) {
            if ((A[i]-A[i-1])*(A[i-1]-A[i-2])<0) {
                dp[i]=2;
            }
            else {
                dp[i] = dp[i-1] + 1;
                if (dp[i]>max) {
                    max = dp[i];
                }
            }
        }
        return max;
    }
}