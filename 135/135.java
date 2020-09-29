public class Solution {
    /**
     * @param candidates: A list of integers
     * @param target: An integer
     * @return: A list of lists of integers
     */
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        // write your code here
        List<List<Integer>> res = new ArrayList();
        Arrays.sort(candidates);
        find(candidates,target,res,new ArrayList(),0);
        return res;
    }
    
    private void find(int[] candidates, int target, List<List<Integer>> res, List<Integer> now, int index) {
        if (target==0) {
            res.add(new ArrayList<>(now));
            return;
        }
        if (target<0) {
            return;
        }
        for (int i=index;i<candidates.length;i++) {
            if ((i>0)&&(candidates[i]==candidates[i-1])) {
                continue;
            }
            else {
                now.add(candidates[i]);
                find(candidates,target-candidates[i],res,now,i);
                now.remove(now.size()-1);
            }
        }
    }
}