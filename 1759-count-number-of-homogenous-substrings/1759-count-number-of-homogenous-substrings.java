class Solution {
    public int countHomogenous(String s) {
        int mod = 1000000007;
        long ans = 0;

        int i = 0;
        int j = 0;

        while (i < s.length()) {

            while (j < s.length() && s.charAt(i) == s.charAt(j)) {
                j++;
            }

            long len = j - i;

            ans = (ans + (len * (len + 1)) / 2) % mod;

            i = j;
        }

        return (int) ans;
    }
}