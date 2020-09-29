public class Solution {
    /**
     * @param nums: an integer array
     * @return: nothing
     */
    public void moveZeroes(int[] nums) {
        // write your code here
        int i=0,j=0,temp;
        while (i<nums.length) {
            if (nums[i]==0) {
                j=i;
                while ((j<nums.length)&&(nums[j]==0)) {
                    j++;
                }
                if (j==nums.length) {
                    break;
                }
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            i++;
        }
    }
}