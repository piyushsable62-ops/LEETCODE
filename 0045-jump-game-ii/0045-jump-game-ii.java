class Solution {
    public int jump(int[] arr) {
        int jumps = 0;
        int l = 0;
        int r = 0;

        while (r < arr.length - 1) {
            int farthest = 0;

            for (int ind = l; ind <= r; ind++) {
                farthest = Math.max(ind + arr[ind], farthest);
            }

            l = r + 1;
            jumps = jumps + 1;
            r = farthest;
        }

        return jumps;
    }
}