class Solution {
    public int maxProfit(int[] arr) {
        int min = Integer.MAX_VALUE;
        int diff = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }

            int x = arr[i] - min;

            if (x > diff) {
                diff = x;
            }
        }

        return diff;
    }
}