class Solution {
    public int largestInteger(int[] nums, int k) {
        ArrayList<Integer> freq = new ArrayList<>();
        for (int i = 0; i <= 50; i++) {
            freq.add(0);
        }
        for (int i = 0; i <= nums.length - k; i++) {
         boolean[] seen = new boolean[51];
            for (int j = i; j < i + k; j++) {
                int x = nums[j];
                if (!seen[x]) {
                    freq.set(x, freq.get(x) + 1);
                    seen[x] = true;
                }
            }
        }
        int ans = -1;
        for (int x = 0; x <= 50; x++) {
            if (freq.get(x) == 1) {
                ans = x;
            }
        }
        return ans;
    }
}