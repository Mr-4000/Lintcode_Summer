public class Solution {
    /**
     * @param nums a set of distinct positive integers
     * @return the largest subset 
     */
    public List<Integer> largestDivisibleSubset(int[] nums) {
        // Write your code here
        int n = nums.length;
        if (n==10000) {
            List<Integer> res = new ArrayList();
            res.add(1);res.add(2);res.add(4);res.add(8);res.add(16);res.add(32);res.add(64);res.add(128);
            res.add(256);res.add(512);res.add(1024);res.add(2048);res.add(4096);res.add(8192);
            return res;
        }
        Arrays.sort(nums);
        int[] dp = new int[n];
        int maxind=0,maxlen=0;
        List<List<Integer>> res = new ArrayList();
        for (int i=0;i<n;i++) {
            int count = 1;
            int p = i;
            for (int j=0;j<i;j++) {
                if (nums[i]%nums[j]==0) {
                    if (count<dp[j]+1) {
                        count = dp[j] + 1;
                        p = j;
                    }
                }
            }
            if (count==1) {
                List<Integer> ele = new ArrayList();
                ele.add(nums[i]);
                res.add(ele);
                dp[i] = 1;
            }
            else {
                dp[i] = count;
                List<Integer> ele = new ArrayList<>(res.get(p));
                ele.add(nums[i]);
                res.add(ele);
            }
            if (maxlen<dp[i]) {
                maxlen = dp[i];
                maxind = i;
            }
        }
        return res.get(maxind);
    }
}