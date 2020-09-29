public class TwoSum {
    /**
     * @param number: An integer
     * @return: nothing
     */
    List<Integer> sum = new ArrayList();
    public void add(int number) {
        // write your code here
        sum.add(number);
    }

    /**
     * @param value: An integer
     * @return: Find if there exists any pair of numbers which sum is equal to the value.
     */
    public boolean find(int value) {
        sum.sort(Comparator.naturalOrder());
        // write your code here
        int i,j;
        i = 0;
        j = sum.size()-1;
        while (i<j) {
            if (sum.get(i) + sum.get(j) == value) {
                return true;
            }
            if (sum.get(i) + sum.get(j) < value) {
                i++;
            }
            else {
                j--;
            }
        }
        return false;
    }
}