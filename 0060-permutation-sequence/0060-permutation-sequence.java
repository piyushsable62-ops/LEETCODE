class Solution {

    int count = 0;

    public String getPermutation(int n, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        boolean[] seen = new boolean[n + 1];

        return helper(n, seen, ans, k);
    }

    public String helper(int n, boolean[] seen, ArrayList<Integer> ans, int k) {

       
        if (ans.size() == n) {
            count++;

            if (count == k) {
                StringBuilder sb = new StringBuilder();
                for (int num : ans) {
                    sb.append(num);
                }
                return sb.toString();
            }

            return null;
        }

        for (int i = 1; i <= n; i++) {

            if (!seen[i]) {

                seen[i] = true;
                ans.add(i);

                String res = helper(n, seen, ans, k);

                
                if (res != null) {
                    return res;
                }

                ans.remove(ans.size() - 1);
                seen[i] = false;
            }
        }

        return null;
    }
}