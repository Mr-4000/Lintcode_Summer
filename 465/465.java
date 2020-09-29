public class Solution {
    /**
     * @param A: an integer arrays sorted in ascending order
     * @param B: an integer arrays sorted in ascending order
     * @param k: An integer
     * @return: An integer
     */
    public int kthSmallestSum(int[] A, int[] B, int k) {
        // write your code here
        int[] C = new int[A.length*B.length];
        for (int i=0;i<A.length;i++) {
            for (int j=0;j<B.length;j++) {
                C[i*B.length+j] = A[i] + B[j];
            }
        }
        Arrays.sort(C);
        return C[k-1];
    }
}