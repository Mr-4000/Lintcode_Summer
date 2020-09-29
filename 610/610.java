public class Solution {
    /**
     * @param nums: an array of Integer
     * @param target: an integer
     * @return: [num1, num2] (num1 < num2)
     */
    public int[] twoSum7(int[] nums, int target) {
        // write your code here
        int n = nums.length;
        int i=0,j=1;
        int[] res = new int[2];
        while (j<n) {
            if ((nums[j] - nums[i] == target)&&(i!=j)) {
                res[0] = Math.min(nums[i],nums[j]);
                res[1] = Math.max(nums[i],nums[j]);
                return res;
            }
            if (nums[j] - nums[i] <= target) {
                j++;
            }
            else {
                i++;
            }
        }
        return res;
    }
}