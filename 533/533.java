public class Solution {
    /**
     * @param nums: an integer array
     * @param target: An integer
     * @return: the difference between the sum and the target
     */
    public int twoSumClosest(int[] nums, int target) {
        // write your code here
        Arrays.sort(nums);
        int i=0,j=nums.length-1,abs=Integer.MAX_VALUE;
        while (i<j) {
            if (nums[i] + nums[j] == target) {
                return 0;
            }
            if (nums[i] + nums[j] > target) {
                abs = Math.min(abs,nums[i] + nums[j] - target);
                j--;
            }
            else {
                abs = Math.min(abs,target - nums[i] - nums[j]);
                i++;
            }
        }
        return abs;
    }
}