public class Solution {
    /**
     * @param s: a string
     * @param k: an integer
     * @return: the number of substrings there are that contain at least k distinct characters
     */
    public long kDistinctCharacters(String s, int k) {
        // Write your code here
        int n = s.length();
        long count = 0;
        for (int i=0;i<=n-k;i++) {
            int j=i;
            List<Character> word = new ArrayList();
            while(j<n) {
                if (!word.contains(s.charAt(j))) {
                    word.add(s.charAt(j));
                }
                if (word.size()==k) {
                    break;
                }
                j++;
            }
            count = count + n - j;
        }
        return count;
    }
}