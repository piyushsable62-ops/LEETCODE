class Solution {
    public int findDuplicate(int[] arr) {
        int n = arr.length;
        int i = 0;

        while (i < n) {
            int idx = arr[i] - 1;

            if (arr[i] != i + 1) {
                if (arr[i] == arr[idx]) {
                    return arr[i];
                }

                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
            } else {
                i++;
            }
        }
        return -1;
    }
}