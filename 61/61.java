public class Solution {
    /**
     * @param A: an integer sorted array
     * @param target: an integer to be inserted
     * @return: a list of length 2, [index1, index2]
     */
    public int[] searchRange(int[] A, int target) {
        // write your code here
        int n = A.length;
        int[] res = new int[2];
        res[0] = -1;
        res[1] = -1;
        if (n==0) {
            return res;
        }
        int l = 0, r = n-1, m = 0;
        while (l<=r) {
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
            return res;
        }
        return find(A,m);
    }
    
    private int[] find(int[] A, int m) {
        int target = A[m];
        int l=m,r=m;
        while ((l>=0)&&(A[l]==target)) {
            l--;
        }
        while ((r<A.length)&&(A[r]==target)) {
            r++;
        }
        int[] res = new int[2];
        res[0] = l+1;
        res[1] = r-1;
        return res;
    }
}