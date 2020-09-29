public class Solution {
    /**
     * @param nums: an array of integer
     * @param target: An integer
     * @return: An integer
     */
    public int twoSum6(int[] nums, int target) {
        // write your code here
        Arrays.sort(nums);
        int i,j,sum=0;
        i = 0;
        j = nums.length - 1;
        while (i<j) {
            if (nums[i] + nums[j] == target) {
                sum++;
                i++;
                while ((i<nums.length)&&(nums[i]==nums[i-1])) {
                    i++;
                }
            }
            else {
                if (nums[i] + nums[j] < target) {
                    i++;
                    while ((i<nums.length)&&(nums[i]==nums[i-1])) {
                        i++;
                    }
                }
                else {
                    j--;
                    while ((j>=0)&&(nums[j]==nums[j+1])) {
                        j--;
                    }
                }
            }
        }
        return sum;
    }
}