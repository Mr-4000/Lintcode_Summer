public class Solution {
    /*
     * @param A: An integer array.
     * @return: nothing
     */
    public void rerange(int[] A) {
        // write your code here
        int sumPositive=0;
        int i,j,n=A.length,indexPositve,indexNegative,temp;
        for (i=0;i<n;i++) {
            if (A[i] > 0) {
                sumPositive++;
            }
        }
        if (sumPositive>n/2) {
            indexPositve=0;
            indexNegative=1;
        }
        else {
            indexNegative=0;
            indexPositve=1;
        }
        while ((indexPositve<n)&&(indexNegative<n)) {
            while ((indexPositve<n)&&(A[indexPositve]>0)) {
                indexPositve = indexPositve + 2;
            }
            while ((indexPositve<n)&&(A[indexNegative]<0)) {
                indexNegative = indexNegative + 2;
            }
            if ((indexPositve>=n)||(indexNegative>=n)) {
                break;
            }
            temp = A[indexPositve];
            A[indexPositve] = A[indexNegative];
            A[indexNegative] = temp;
        }
        for (i=0;i<n;i++) {
            System.out.print(A[i]);
        }
    }
}