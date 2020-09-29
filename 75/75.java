public class Solution {
    /**
     * @param A: An integers array.
     * @return: return any of peek positions.
     */
    public int findPeak(int[] A) {
        // write your code here
        int l=1,r=A.length-2,m=0;
        while (l<=r) {
            m = l + (r-l) / 2;
            if ((A[m]>A[m-1])&&(A[m]>A[m+1])) {
                return m;
            }
            if ((A[m]>A[m-1])) {
                l = m+1;
            }
            else {
                r = m-1;
            }
        }
        return m;
    }
}