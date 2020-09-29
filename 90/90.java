public class Solution {
    /*
     * @param A: an integer array
     * @param k: a postive integer <= length(A)
     * @param target: an integer
     * @return: A list of lists of integer
     */
    public List<List<Integer>> kSumII(int[] A, int k, int target) {
        // write your code here
        Arrays.sort(A);
        List<List<Integer>> res = new ArrayList();
        find(A,k,target,res,new ArrayList(),-1);
        return res;
    }
    
    private void find(int[] A,int k,int target,List<List<Integer>> res,List<Integer> temp,int index) {
        if ((k==0)&&(target==0)) {
            res.add(new ArrayList<>(temp));
            return;
        }
        if ((k<0)||(target<0)) {
            return;
        }
        for (int i=index+1;i<A.length;i++) {
            temp.add(A[i]);
            find(A,k-1,target-A[i],res,temp,i);
            temp.remove(temp.size()-1);
        }
    }
}