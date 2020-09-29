public class Solution {
    /**
     * @param A: a string
     * @param B: a string
     * @return: return the sum of two strings
     */
    public String SumofTwoStrings(String A, String B) {
        // write your code here
        int n = A.length() - 1;
        int m = B.length() - 1;
        String res = "";
        while ((n>=0)||(m>=0)) {
            if (n<0) {
                res = B.substring(0,m+1) + res;
                break;
            }
            if (m<0) {
                res = A.substring(0,n+1) + res;
                break;
            }
            int a_digit = A.charAt(n)-48;
            int b_digit = B.charAt(m)-48;
            res = Integer.toString(a_digit+b_digit) + res;
            n--;
            m--;
        }
        return res;
    }
}