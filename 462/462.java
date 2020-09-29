public class Solution {
    /**
     * @param A: A an integer array sorted in ascending order
     * @param target: An integer
     * @return: An integer
     */
    public int totalOccurrence(int[] A, int target) {
        // write your code here
        int n = A.length;
        if (n==0) {
            return 0;
        }
        int l = 0, r = n-1, m = 0;
        while (l<r) {
            m = l + (r-l) / 2;
            if (A[m] == target) {
                break;
            }
            if (A[m] < target) {
                l = m + 1;
            }
            else {
                r = m - 1;
            }
        }
        if (A[m]!=target) {
            return 0;
        }
        return find(A,m);
    }
    
    private int find(int[] A, int m) {
        int target = A[m];
        int l=m,r=m;
        while ((l>=0)&&(A[l]==target)) {
            l--;
        }
        while ((r<A.length)&&(A[r]==target)) {
            r++;
        }
        return r - l - 1;
    }
}