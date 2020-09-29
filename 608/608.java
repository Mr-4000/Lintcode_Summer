public class Solution {
    /**
     * @param nums: an array of Integer
     * @param target: target = nums[index1] + nums[index2]
     * @return: [index1 + 1, index2 + 1] (index1 < index2)
     */
    public int[] twoSum(int[] nums, int target) {
        // write your code here
        int i=1,j= nums.length;
        int[] ans = new int[2];
        while (i<j) {
            if (nums[i-1]+nums[j-1] == target) {
                ans[0] = i;
                ans[1] = j;
                return ans;
            }
            if (nums[i-1] + nums[j-1] < target) {
                i++;
            }
            else {
                j--;
            }
        }
        return ans;
    }
}