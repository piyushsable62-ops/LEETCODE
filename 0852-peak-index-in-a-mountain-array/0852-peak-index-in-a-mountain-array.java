class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int i = 0;
        int j = arr.length - 1;

        while (i <= j) {
            int mid = i + (j - i) / 2;

            
            if (mid == 0) {
                i = mid + 1;
                continue;
            }

            if (mid == arr.length - 1) {
                j = mid - 1;
                continue;
            }

            if (arr[mid - 1] < arr[mid] && arr[mid] < arr[mid + 1]) {
                // Increasing slope
                i = mid + 1;
            } else if (arr[mid - 1] > arr[mid] && arr[mid] > arr[mid + 1]) {
                // Decreasing slope
                j = mid - 1;
            } else {
               
                return mid;
            }
        }

        return -1;
    }
}