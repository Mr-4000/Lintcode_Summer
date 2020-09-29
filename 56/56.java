public class Solution {
    /**
     * @param numbers: An array of Integer
     * @param target: target = numbers[index1] + numbers[index2]
     * @return: [index1 + 1, index2 + 1] (index1 < index2)
     */
    public int[] twoSum(int[] numbers, int target) {
        // write your code here
        int n = numbers.length;
        int[] a = new int[n];
        for (int i=0;i<n;i++) {
            a[i] = numbers[i];
        }
        Arrays.sort(a);
        int m=0;
        n--;
        while (m<n) {
            if (a[m] + a[n] == target) {
                break;
            }
            if (a[m] + a[n] < target) {
                m++;
            }
            else {
                n--;
            }
        }
        System.out.println(a[m]);
        System.out.println(a[n]);
        return getAns(numbers,a[m],a[n]);
    }
    
    private int[] getAns(int[] numbers,int m,int n) {
        int l = numbers.length;
        int i=0,j=l-1;
        while ((numbers[i]!=m)&&(numbers[i]!=n)) {
            i++;
        }
        while ((numbers[j]!=m)&&(numbers[j]!=n)) {
            j--;
        }
        int[] res = new int[2];
        res[0] = i;
        res[1] = j;
        return res;
    }
}