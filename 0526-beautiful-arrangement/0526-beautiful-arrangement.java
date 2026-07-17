class Solution {

    int count = 0;

    public int countArrangement(int n) {
        boolean[] used = new boolean[n + 1];
        helper(1, n, used);
        return count;
    }

    public void helper(int index, int n, boolean[] used) {

        if (index > n) {
            count++;
            return;
        }

        for (int i = 1; i <= n; i++) {

            if (used[i]) {
                continue;
            }

            if (i % index == 0 || index % i == 0) {

                used[i] = true;

                helper(index + 1, n, used);

                used[i] = false;
            }
        }
    }
}