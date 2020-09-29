public class Solution {
    /**
     * @param nums: An integer array
     * @return: The length of LIS (longest increasing subsequence)
     */
    public int longestIncreasingSubsequence(int[] nums) {
        // write your code here
        if (nums.length==0) {
            return 0;
        }
        int max=0;
        int n = nums.length;
        int[] dp=new int[n];
        for (int i=0;i<n;i++) {
            int temp = 1;
            for (int j=0;j<i;j++) {
                if (nums[i]>nums[j]) {
                    if (temp<dp[j]+1) {
                        temp = dp[j]+1;
                    }
                }
            }
            dp[i] = temp;
            if (dp[i]>max) {
                max = dp[i];
            }
        }
        return max;
    }
}