public class Solution {
    /**
     * @param nums: The integer array you should partition
     * @param k: An integer
     * @return: The index after partition
     */
    public int partitionArray(int[] nums, int k) {
        // write your code here
        if (nums.length==0) {
            return 0;
        }
        int i=0,j=nums.length-1,temp;
        while (i<=j) {
            if (nums[i]>=k) {
                temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j--;
            }
            else {
                i++;
            }
        }
        return i;
    }
}