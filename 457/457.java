public class Solution {
    /**
     * @param nums: An integer array sorted in ascending order
     * @param target: An integer
     * @return: An integer
     */
    public int findPosition(int[] nums, int target) {
        // write your code here
        int l=0,r = nums.length,m;
        while (l<r) {
            m = l + (r - l) / 2;
            if (nums[m]==target) {
                return m;
            }
            if (nums[m] < target) {
                l = m + 1;
            }
            else {
                r = m - 1;
            }
        }
        return -1;
    }
}