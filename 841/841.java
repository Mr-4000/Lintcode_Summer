public class Solution {
    /**
     * @param a: The A array
     * @param b: The B array
     * @param s: The S string
     * @return: The answer
     */
    public String stringReplace(String[] a, String[] b, String s) {
        // Write your code here
        int lens = s.length(), lena = a.length;
        long seed=37,mod=100000003;
        List<Long> HashA = new ArrayList();
        List<Long> HashS = new ArrayList();
        StringBuilder newS = new StringBuilder(s);
        int i,j;
        long atemp,stemp,ptemp;
        for (i=0;i<lena;i++) {
            atemp = 0;
            for (j=0;j<a[i].length();j++) {
                atemp = atemp * seed + a[i].charAt(j);
                atemp = atemp % mod;
            }
            HashA.add(atemp);
        }
        stemp = 0;
        ptemp = 1;
        List<Long> pow = new ArrayList();
        HashS.add(stemp);
        pow.add(ptemp);
        for (i=0;i<lens;i++) {
            stemp = stemp * seed + s.charAt(i);
            stemp = stemp % mod;
            HashS.add(stemp);
            ptemp = ptemp * seed;
            ptemp = ptemp % mod;
            pow.add(ptemp);
        }
        i = 0;
        while (i<lens) {
            stemp = 0; // 改为记录最长长度
            ptemp = -1; //改为记录最长长度index
            for (j=0;j<lena;j++) {
                if (i+a[j].length()>lens) {
                    continue;
                }
                long aHash = HashA.get(j);
                long sHash = HashS.get(a[j].length()+i) - pow.get(a[j].length()) * HashS.get(i) % mod;
                aHash = aHash % mod;
                sHash = (sHash % mod + mod) % mod;
                if ((aHash==sHash)&&(stemp<a[j].length())) {
                    stemp = a[j].length();
                    ptemp = j;
                }
            }
            if (ptemp!=-1) {
                newS = newS.replace(i,i+(int)stemp,b[(int)ptemp]);
                i = i + (int)stemp;
            }
            else {
                i++;
            }
        }
        return newS.toString();
    }
}