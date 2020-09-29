public class Solution {
    /**
     * @param nums: a rotated sorted array
     * @return: the minimum number in the array
     */
    public int findMin(int[] nums) {
        // write your code here
        int l=0,r=nums.length-1,m=0;
        while (l<=r) {
            if (nums[r]>nums[l]) {
                return nums[l];
            }
            m = l + (r-l) / 2;
            if ((m>0)&&(nums[m]<nums[m-1])) {
                return nums[m];
            }
            if (nums[m] >= nums[l]) {
                l = m+1;
            }
            else {
                r = m-1;
            }
        }
        return nums[m];
    }
}