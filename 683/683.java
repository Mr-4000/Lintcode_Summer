public class Solution {
    /*
     * @param : A string
     * @param : A set of word
     * @return: the number of possible sentences.
     */
    public int wordBreak3(String s, Set<String> dict) {
        // Write your code here
        s = s.toLowerCase();
        List<String> words = new ArrayList();
        int maxlen=0;
        for (String word:dict) {
            word = word.toLowerCase();
            if (!words.contains(word)) {
                words.add(word);
                maxlen = Math.max(maxlen,word.length());
            }
        }
        int n = s.length();
        int[] dp = new int[n+1];
        for (int i=1;i<n+1;i++) {
            for (int j=Math.max((i-maxlen),0);j<i;j++) {
                if ((j!=0)&&(dp[j]==0)) {
                    continue;
                }
                if (words.contains(s.substring(j,i))) {
                    if (j==0) {
                        dp[i]=1;
                    }
                    else {
                        dp[i] = dp[i] + dp[j];
                    }
                }
            }
        }
        return dp[n];
    }
}