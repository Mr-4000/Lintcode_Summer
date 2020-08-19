public class Solution {
    /**
     * @param str: A String
     * @param left: a left offset
     * @param right: a right offset
     * @return: return a rotate string
     */
    public String RotateString2(String str, int left, int right) {
        if (str.length()==0) {
            return "";
        }
        // write your code here
        left = left % str.length();
        right = right % str.length();
        str = str.substring(left,str.length()) + str.substring(0,left);
        str = str.substring(str.length()-right,str.length()) + str.substring(0,str.length()-right);
        return str;
    }
}