public class Solution {
    /**
     * @param s: A string
     * @return: Whether the string is a valid palindrome
     */
    public boolean isPalindrome(String s) {
        // write your code here
        if (s=="") {
            return true;
        }
        s = s.toUpperCase();
        int i=0,j=s.length()-1;
        while ((i<s.length())&&(!check(s.charAt(i)))) {
            i++;
        }
        while ((j>=0)&&(!check(s.charAt(j)))) {
            j--;
        }
        while(i<j) {
            while (!check(s.charAt(i))) {
                i++;
            }
            while (!check(s.charAt(j))) {
                j--;
            }
            if (!(s.charAt(i)==s.charAt(j))) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    
    private boolean check(char c) {
        int asc;
        asc = c;
        if ((asc>=65)&&(asc<=90)) {
            return true;
        }
        if ((asc>=48)&&(asc<=57)) {
            return true;
        }
        if ((asc>=97)&&(asc<=122)) {
            return true;
        }
        return false;
    }
}