public class Solution {
    /**
     * @param nums1: an integer array
     * @param nums2: an integer array
     * @return: an integer array
     */
    public int[] intersection(int[] nums1, int[] nums2) {
        // write your code here
        HashSet<Integer> resSet = new HashSet();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0, j=0;
        while ((i<nums1.length)&&(j<nums2.length)) {
            if (nums1[i] == nums2[j]) {
                resSet.add(nums1[i]);
                i = next(nums1,i);
                j = next(nums2,j);
                continue;
            }
            if (nums1[i]<nums2[j]) {
                i = next(nums1,i);
            }
            else {
                j = next(nums2,j);
            }
        }
        int index = 0;
        int[] res = new int[resSet.size()];
        for (int ele:resSet) {
            res[index] = ele;
            index++;
        }
        return res;
    }
    
    private int next(int[] a, int n) {
        int num = a[n];
        while (a[n]==num) {
            n++;
            if (n==a.length) {
                return n;
            }
        }
        return n;
    }
}