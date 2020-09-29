public class Solution {
    /**
     * @param nums: A list of integers
     * @return: A list of integers includes the index of the first number and the index of the last number
     */
    public List<Integer> subarraySum(int[] nums) {
        // write your code here
        HashMap<Integer,Integer> sum = new HashMap();
        List<Integer> res = new ArrayList();
        int s=0;
        for (int i=0;i<nums.length;i++) {
            if (nums[i]==0) {
                res.add(i);
                res.add(i);
                return res;
            }
            s = s + nums[i];
            if (s==0) {
                res.add(0);
                res.add(i);
                return res;
            }
            if (sum.containsKey(s)) {
                res.add(sum.get(s)+1);
                res.add(i);
                return res;
            }
            sum.put(s,i);
        }
        return res;
    }
}