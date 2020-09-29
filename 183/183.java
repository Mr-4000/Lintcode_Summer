public class Solution {
    /**
     * @param L: Given n pieces of wood with length L[i]
     * @param k: An integer
     * @return: The maximum length of the small pieces
     */
    public int woodCut(int[] L, int k) {
        // write your code here
        int i,l,r,m=0;
        long sum=0;
        for (i=0;i<L.length;i++) {
            sum = sum + L[i];
        }
        l = 1;
        r = (int) (sum / k);
        while (l<=r) {
            m = l + (r-l) / 2;
            if (cutPieces(L,m,k) && !cutPieces(L,m+1,k)) {
                return m;
            }
            if (cutPieces(L,m,k)) {
                l = m+1;
            }
            else {
                r = m-1;
            }
        }
        return m;
    }
    
    private boolean cutPieces(int[] l,int target,int k) {
        int sum=0;
        for (int i=0;i<l.length;i++) {
            sum = sum + l[i] / target;
        }
        if (sum>=k) {
            return true;
        }
        else {
            return false;
        }
    }
}