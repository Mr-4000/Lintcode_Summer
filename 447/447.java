public class Solution {
    /**
     * @param reader: An instance of ArrayReader.
     * @param target: An integer
     * @return: An integer which is the first index of target.
     */
    public int searchBigSortedArray(ArrayReader reader, int target) {
        // write your code here
        int l = 0,r=1,m;
        while (reader.get(r) < target)
            r <<= 1;
        while(l <= r){
            m = l + (r-l) / 2;
            if (reader.get(m)==target) {
                while (reader.get(m)==target) {
                    m--;
                }
                return m+1;
            }
            if(reader.get(m) > target)
                r = m-1;
            else
                l = m+1;
        }
        return -1;
    }
}