class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder ans = new StringBuilder();
        int count = 0;

        while (ans.length() < b.length()) {
            ans.append(a);
            count++;
        }

        if (ans.toString().contains(b)) {
            return count;
        }

        ans.append(a);
        count++;

        if (ans.toString().contains(b)) {
            return count;
        }

        return -1;
    }
}