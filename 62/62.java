public class Solution {
    /**
     * @param A: an integer rotated sorted array
     * @param target: an integer to be searched
     * @return: an integer
     */
    public int search(int[] A, int target) {
        // write your code here
        int l,r,m = 0;
        l = 0;
        r = A.length - 1;
        while (l<=r) {
            m = l + (r - l) / 2;
            if (A[m] == target) {
                return m;
            }
            if (A[m] < A[l]) {
                if (A[m] < target) {
                    if (A[l] <= target) {
                        r = m-1;
                    }
                    else {
                        l = m+1;
                    }
                }
                else {
                    r = m-1;
                }
            }
            else {
                if (A[m] < target) {
                    l = m+1;
                }
                else {
                    if (target < A[l]) {
                        l = m+1;
                    }
                    else {
                        r = m-1;
                    }
                }
            }
        }
        return -1;
    }
}