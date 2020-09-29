public class Solution {
    /**
     * @param str: the string
     * @return: the number of substrings 
     */
    public int stringCount(String str) {
        // Write your code here.
        int n = str.length();
        if (n==0) {
            return 0;
        }
        int res = 0;
        int count = 0;
        for (int i=0;i<n;i++) {
            if (str.charAt(i)=='0') {
                count++;
            }
            else {
                res = res + count * (count+1) / 2;
                count = 0;
            }
        }
        res = res + count * (count+1) / 2;
        return res;
    }
}