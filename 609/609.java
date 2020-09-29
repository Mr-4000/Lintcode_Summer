public class Solution {
    /**
     * @param nums: an array of integer
     * @param target: an integer
     * @return: an integer
     */
    public int twoSum5(int[] nums, int target) {
        // write your code here
        Arrays.sort(nums);
        int i,j,sum=0;
        for (j=nums.length-1;j>0;j--) {
            i=0;
            while ((i<j)&&(nums[i]+nums[j]<=target)) {
                i++;
            }
            sum = sum + i;
        }
        return sum;
    }
}