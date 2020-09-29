public class Solution {
    /**
     * @param nums: a continuous stream of numbers
     * @param number: a number
     * @return: returns the first unique number
     */
    public int firstUniqueNumber(int[] nums, int number) {
        // Write your code here
        if (nums == null || nums.length == 0) {
            return -1;
        }
        
        Map<Integer, Boolean> map = new HashMap<>();
        int ind = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == number) {
                ind = i;
                break;
            }
            // 从这一句可以看出，如果一个数在出现第一次的时候，会put进false，之后再出现的时候就会put进true
            map.put(nums[i], map.containsKey(nums[i]));
        }
        // 如果ind = -1说明number不存在，则返回-1
        if (ind == -1) {
            return -1;
        }
    	// 接下来扫描number之前的数字，一旦发现unique的就返回
        for (int i = 0; i < ind; i++) {
            if (!map.get(nums[i])) {
                return nums[i];
            }
        }
        // 如果上面没返回，说明number本身是第一个unique的，则将其返回
        return number;
    }
}