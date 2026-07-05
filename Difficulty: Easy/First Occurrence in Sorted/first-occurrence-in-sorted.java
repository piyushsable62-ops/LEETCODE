class Solution {
    public int firstSearch(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;
        int i = -1;

        while (low <= high) {
            int mid = (high - low) / 2 + low;

            if (arr[mid] > k) {
                high = mid - 1;
            } else if (arr[mid] < k) {
                low = mid + 1;
            } else {
                i = mid;
                high = mid-1;
            }
        }


        return i;
    }
}