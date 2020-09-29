public class Solution {
    /*
     * @param source: A source string
     * @param target: A target string
     * @return: An integer as index
     */
    public int strStr2(String source, String target) {
        // write your code here
        if ((source==null)||(target==null)) {
            return -1;
        }
        if (target.length()==0) {
            return 0;
        }
        int targetHash=0,sourceHash=0;
        int i,j;
        int bigHash = 1;
        for (i=0; i<target.length(); i++){
            bigHash = bigHash * 37 % 1000003;
        }
        for (i=0;i<target.length();i++) {
            targetHash = (targetHash * 37 + target.charAt(i)) % 1000003;
        }
        for (i=0; i<source.length(); i++){
            sourceHash = (sourceHash * 37 + source.charAt(i)) % 1000003;
            if (i>=target.length()) {
                sourceHash = sourceHash - (source.charAt(i-target.length()) * bigHash) % 1000003;
                if (sourceHash < 0 ) {
                    sourceHash = sourceHash + 1000003;
                }
            }
            if (sourceHash == targetHash) {
                return (i-target.length()+1);
            }
        }
        return -1;
    }
}