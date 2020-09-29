public class Solution {
    /**
     * @param x: the base number
     * @param n: the power number
     * @return: the result
     */
    public double myPow(double x, int n) {
        // write your code here
        int fl = 1;
        if (n==Integer.MIN_VALUE) {
            return 0;
        }
        if (n<0) {
            fl = -1;
            n = -n;
        }
        double[] map = new double[n/2+1];
        int[] binaryn = new int[n/2+1];
        int count = 0;
        double res = 1;

        while (n!=0) {
            binaryn[count] = n % 2;
            count++;
            n = n / 2;
        }
        map[0] = x;
        for (int i=1;i<count;i++) {
            map[i] = map[i-1] * map[i-1];
        }
        for (int i=0;i<count;i++) {
            if (binaryn[i]==1) {
                res = res * map[i];
            }
        }
        if (fl==1) {
            return res;
        }
        else {
            return 1/res;   
        }
    }
}