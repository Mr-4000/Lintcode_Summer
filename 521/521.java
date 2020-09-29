public class Solution {
    /**
     * @param nums: an array of integers
     * @return: the number of unique integers
     */
    public int deduplication(int[] nums) {
        // write your code here
        HashSet<Integer> map = new HashSet();
        int n = nums.length;
        int res=0;
        for (int i=0;i<n;i++) {
            if (map.contains(nums[i])) {
                continue;
            }
            map.add(nums[i]);
            int temp = nums[i];
            nums[i] = nums[res];
            nums[res] = temp;
            res++;
        }
        return res;
    }
}