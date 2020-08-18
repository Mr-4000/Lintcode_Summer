public class Solution {
    /**
     * @param source: 
     * @param target: 
     * @return: return the index
     */
    public int strStr(String source, String target) {
        // Write your code here
        int l1=target.length(),l2=source.length();
        for (int i=0;i<=l2-l1;i++) {
            if (source.substring(i,i+l1).equals(target)) {
                return i;
            }
        }
        return -1;
    }
}