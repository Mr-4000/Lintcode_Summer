public class Solution {
    /**
     * @param colors: A list of integer
     * @param k: An integer
     * @return: nothing
     */
    public void sortColors2(int[] colors, int k) {
        // write your code here
        int n = colors.length;
        int i=0, j;
        for (int num=1;num<=k;num++) {
            for (j=i;j<n;j++) {
                if (colors[j] == num) {
                    swap(colors,j,i);
                    i++;
                }
            }
        }
    }
    
    private void swap(int[] colors, int a, int b) {
        int temp = colors[a];
        colors[a] = colors[b];
        colors[b] = temp;
    }
}