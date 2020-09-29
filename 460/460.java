public class Solution {
    /**
     * @param A: an integer array
     * @param target: An integer
     * @param k: An integer
     * @return: an integer array
     */
    public int[] kClosestNumbers(int[] A, int target, int k) {
        // write your code here
        int[] ans = new int[k];
        int l = 0, r=A.length-1,m=0,i;
        while (l<=r) {
            m = l + (r-l) / 2;
            if ((m==A.length-1)||(m==0)) {
                break;
            }
            if ((A[m]==target)||((A[m]<target)&&(A[m+1]>target))) {
                break;
            }
            if (A[m+1]>target) {
                r = m - 1;
            }
            else {
                l = m + 1;
            }
        }
        System.out.println(m);
        l = m;
        r = m+1;
        for (i=0;i<k;i++) {
            if ((r==A.length)||((l!=-1)&&((target-A[l])<=(A[r]-target)))) {
                ans[i] = A[l];
                System.out.println(ans[i]);
                l--;
            }
            else {
                ans[i] = A[r];
                System.out.println(ans[i]);
                r++;
            }
        }
        return ans;
    }
}