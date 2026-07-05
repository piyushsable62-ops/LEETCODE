class Solution {
    public int maximumCount(int[] arr) {

        int count1 = 0;
        int count2 = 0;

        int i = 0;
        int j = arr.length - 1;

        // Find last negative
        while (i <= j) {
            int mid = i + (j - i) / 2;

            if (arr[mid] >= 0) {
                j = mid - 1;
            } else if (mid == arr.length - 1 || arr[mid + 1] >= 0) {
                count1 = mid + 1;
                break;
            } else {
                i = mid + 1;
            }
        }

        i = 0;
        j = arr.length - 1;

        // Find first positive
        while (i <= j) {
            int mid = i + (j - i) / 2;

            if (arr[mid] <= 0) {
                i = mid + 1;
            } else if (mid == 0 || arr[mid - 1] <= 0) {
                count2 = arr.length - mid;
                break;
            } else {
                j = mid - 1;
            }
        }

        return Math.max(count1, count2);
    }
}