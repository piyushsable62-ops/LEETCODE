import java.util.Arrays;

class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            int target = 2 * arr[i];
            int idx = binarySearch(arr, target);

            // Make sure it's not the same index
            if (idx != -1 && idx != i) {
                return true;
            }
        }

        return false;
    }

    private int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}