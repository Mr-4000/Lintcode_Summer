public class Solution {
    /**
     * @param nums: the input array
     * @param target: the target number
     * @return: return the target pair
     */
    public List<List<Integer>> twoSumVII(int[] nums, int target) {
        // write your code here
        int n = nums.length;
        int maxind=0,minind=n-1;
        for (int i=0;i<n;i++) {
            if (nums[i]>nums[maxind]) {
                maxind = i;
            }
            if (nums[i]<nums[minind]) {
                minind = i;
            }
        }
        List<List<Integer>> res = new ArrayList();
        while (nums[maxind]>nums[minind]) {
            if (nums[maxind]+nums[minind] == target) {
                List<Integer> ele = new ArrayList();
                ele.add(Math.min(maxind,minind));
                ele.add(Math.max(maxind,minind));
                res.add(ele);
            }
            if (nums[maxind] + nums[minind] < target) {
                minind = moveMin(nums,minind);
            }
            else {
                maxind = moveMax(nums,maxind);
            }
        }
        return res;
    }
    
    private int moveMin(int[] nums,int present) {
        int n = nums.length;
        if (nums[present]<0) {
            for (int i=present-1;i>=0;i--) {
                if (nums[i]<0) {
                    return i;
                }
            }
            for (int i=0;i<n;i++) {
                if (nums[i]>=0) {
                    return i;
                }
            }
        }
        else {
            for (int i=present+1;i<n;i++) {
                if (nums[i]>0) {
                    return i;
                }
            }
        }
        return present;
    }
    
    private int moveMax(int[] nums,int present) {
        int n = nums.length;
        if (nums[present]<0) {
            for (int i=present+1;i<n;i++) {
                if (nums[i]<0) {
                    return i;
                }
            }
        }
        else {
            for (int i=present-1;i>=0;i--) {
                if (nums[i]>=0) {
                    return i;
                }
            }
            for (int i=0;i<n;i++) {
                if (nums[i]<0) {
                    return i;
                }
            }
        }
        return present;
    }
}