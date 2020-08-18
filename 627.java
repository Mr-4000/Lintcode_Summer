public class Solution {
    /**
     * @param s: a string which consists of lowercase or uppercase letters
     * @return: the length of the longest palindromes that can be built
     */
    public int longestPalindrome(String s) {
        // write your code here
        if (s.length()==0) {
            return 0;
        }
        int[] map = new int[52];
        int i,c,sum=0,fl=0;
        for (i=0;i<s.length();i++) {
            c = s.charAt(i);
            if (s.charAt(i)<='Z') {
                map[c-65]++;
            }
            else {
                map[c-71]++;
            }
        }
        for (i=0;i<52;i++) {
            if (map[i] % 2==0) {
                sum = sum + map[i];
            }
            else {
                fl=1;
                sum = sum + map[i] - 1;
            }
        }
        return sum+fl;
    }
}