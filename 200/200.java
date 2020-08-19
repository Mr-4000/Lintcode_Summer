public class Solution {
    /**
     * @param s: input string
     * @return: a string as the longest palindromic substring
     */
    public String longestPalindrome(String s) {
        // write your code here
        int max=0,n;
        String ans="";
        for(int i=0;i<(s.length()-max/2);i++) {
            if (checkEvenPalindrome(s,i) > checkOddPalindrome(s,i)) {
                if (max < checkEvenPalindrome(s,i)) {
                    max = checkEvenPalindrome(s,i);
                    ans = s.substring(i-max/2+1,i+max/2+1);
                }
            }
            else {
                if (max < checkOddPalindrome(s,i)) {
                    max = checkOddPalindrome(s,i);
                    ans = s.substring(i-max/2,i+max/2+1);
                }
            }
        }
        return ans;
    }
    
    private int checkEvenPalindrome(String s,int center) {
        int i = center+1,j = center,len=0;
        while ((i<s.length())&&(j>=0)&&(s.charAt(i)==s.charAt(j))) {
            len = len+2;
            i++;
            j--;
        }
        return len;
    }
    
    private int checkOddPalindrome(String s,int center) {
        int i=center+1,j=center-1,len=1;
        while ((i<s.length())&&(j>=0)&&(s.charAt(i)==s.charAt(j))) {
            len = len+2;
            i++;
            j--;
        }
        return len;
    }
}