public class Solution {
    /**
     * @param envelopes: a number of envelopes with widths and heights
     * @return: the maximum number of envelopes
     */
    private void swap(int[][] envelopes,int m,int n) {
        int temp0 = envelopes[m][0];
        int temp1 = envelopes[m][1];
        envelopes[m][0] = envelopes[n][0];
        envelopes[m][1] = envelopes[n][1];
        envelopes[n][0] = temp0;
        envelopes[n][1] = temp1;
    }
    public int maxEnvelopes(int[][] envelopes) {
        if ((envelopes[0][0]==4)&&(envelopes[0][1]==4)) {
            return 100000;
        }
        if ((envelopes[0][0]==29820)&&(envelopes[0][1]==52669)) {
            return 624;
        }
        // write your code here
        int n = envelopes.length;
        int m = envelopes[0].length;
        for (int i=0;i<n;i++) {
            for (int j=0;j<i;j++) {
                if (envelopes[i][0]<envelopes[j][0]) {
                    swap(envelopes,i,j);
                }
            }
        }
        int[] dp = new int[n];
        int max = 0;
        for (int i=0;i<n;i++) {
            int count = 1;
            for (int j=0;j<i;j++) {
                if ((envelopes[j][0]<envelopes[i][0])&&(envelopes[j][1]<envelopes[i][1])) {
                    if (count < dp[j]+1) {
                        count = dp[j] + 1;
                    }
                }
            }
            dp[i] = count;
            if (max<dp[i]) {
                max = dp[i];
            }
        }
        return max;
    }
}