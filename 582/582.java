public class Solution {
    /*
     * @param s: A string
     * @param wordDict: A set of words.
     * @return: All possible sentences.
     */
    public List<String> wordBreak(String s, Set<String> wordDict) {
        // write your code here
        List<String> res = new ArrayList();
        res = wordfind(s,wordDict,new HashMap<String,List<String>>());
        return res;
    }
    
    private List<String> wordfind(String s,Set<String> wordDict,Map<String,List<String>> memo) {
        if (memo.containsKey(s)) {
            return memo.get(s);
        }
        List<String> res = new ArrayList();
        for (int i=1;i<s.length();i++) {
            String sub = s.substring(0,i);
            if (!wordDict.contains(sub)) {
                continue;
            }
            List<String> last = wordfind(s.substring(i),wordDict,memo);
            for (String item:last) {
                res.add(sub + " " + item);
            }
        }
        if (wordDict.contains(s)) {
            res.add(s);
        }
        memo.put(s,res);
        return res;
    }
}