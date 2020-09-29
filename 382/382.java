public class Solution {
    /**
     * @param S: A list of integers
     * @return: An integer
     */
    public int triangleCount(int[] S) {
        // write your code here
        Arrays.sort(S);
        int i,j,n,sum = 0;
        for (n=S.length-1;n>1;n--) {
            for (j=n-1;j>0;j--) {
                i=0;
                while ((i<j)&&(S[i]+S[j]<=S[n])) {
                    i++;
                }
                sum = sum + (j-i);
            }
        }
        return sum;
    }
}