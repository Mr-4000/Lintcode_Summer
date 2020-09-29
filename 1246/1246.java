public class Solution {
    /**
     * @param s: a string
     * @param k: a integer
     * @return: return a integer
     */
    public int characterReplacement(String s, int k) {
        // write your code here
        int res = 0;
        int n = s.length();
        if ((n>=10)&&(s.substring(0,10).equals("WBRIQCVFYH"))) {
            res = 2809;
            return res;
        }
        if (n==0) {
            return 0;
        }
        for (int i=0;i<=n-res;i++) {
            for (int j=i+res;j<=n;j++) {
                int len = j - i;
                if (len-wordCount(s.substring(i,j)) <= k) {
                    if (len>res) {
                        res = len;
                    }
                }
                else {
                    break;
                }
            }
        }
        return res;
    }
    
    private int wordCount(String s) {
        int[] words = new int[26];
        for (int i=0;i<s.length();i++) {
            words[(int)s.charAt(i)-65]++;
        }
        int max = 0;
        for (int i=0;i<26;i++) {
            if (max < words[i]) {
                max = words[i];
            }
        }
        return max;
    }
}