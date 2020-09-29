public class Solution {
    /**
     * @param numbers: Give an array numbers of n integer
     * @param target: An integer
     * @return: return the sum of the three integers, the sum closest target.
     */
    public int threeSumClosest(int[] numbers, int target) {
        // write your code here
        int sum=Integer.MAX_VALUE;
        Arrays.sort(numbers);
        int n = numbers.length;
        for (int i=0;i<n-2;i++) {
            int p = i+1, q = n - 1;
            while (p<q) {
                int s = numbers[i] + numbers[p] + numbers[q];
                if (s==target) {
                    return target;
                }
                if (s<target) {
                    if (target-s < Math.abs(target-sum)) {
                        sum = s;
                    }
                    p++;
                }
                else {
                    if (s - target < Math.abs(target-sum)) {
                        sum = s;
                    }
                    q--;
                }
            }
        }
        return sum;
    }
}