public class Solution {
    /**
     * @param numbers: Give an array numbers of n integer
     * @return: Find all unique triplets in the array which gives the sum of zero.
     */
    public List<List<Integer>> threeSum(int[] numbers) {
        // write your code here
        Arrays.sort(numbers);
        List<List<Integer>> ls = new ArrayList<>();
 
        for (int i = 0; i < numbers.length - 2; i++) {
            if (i == 0 || (i > 0 && numbers[i] != numbers[i - 1])) {
 
                int l = i + 1, r = numbers.length - 1, sum = 0 - numbers[i];
                while (l < r) {
                    if (numbers[l] + numbers[r] == sum) {
                        ls.add(Arrays.asList(numbers[i], numbers[l], numbers[r]));
                        while (l < r && numbers[l] == numbers[l + 1]) l++;
                        while (l < r && numbers[r] == numbers[r - 1]) r--;
                        l++;
                        r--;
                    } else if (numbers[l] + numbers[r] < sum) {
                        while (l < r && numbers[l] == numbers[l + 1]) l++; 
                        l++;
                    } else {
                        while (l < r && numbers[r] == numbers[r - 1]) r--;
                        r--;
                    }
                }
            }
        }
        return ls;
    }
}