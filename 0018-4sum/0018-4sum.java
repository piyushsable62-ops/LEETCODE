class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {

        Arrays.sort(arr);
        ArrayList<List<Integer>> ans = new ArrayList<>();

        int n = arr.length;

        for (int a = 0; a < n - 3; a++) {

            // Skip duplicate first elements
            if (a > 0 && arr[a] == arr[a - 1])
                continue;

            for (int b = a + 1; b < n - 2; b++) {

                // Skip duplicate second elements
                if (b > a + 1 && arr[b] == arr[b - 1])
                    continue;

                int c = b + 1;
                int d = n - 1;

                while (c < d) {

                    long sum = (long) arr[a] + arr[b] + arr[c] + arr[d];

                    if (sum < target) {
                        c++;
                    } else if (sum > target) {
                        d--;
                    } else {

                        ArrayList<Integer> list = new ArrayList<>();
                        list.add(arr[a]);
                        list.add(arr[b]);
                        list.add(arr[c]);
                        list.add(arr[d]);

                        ans.add(list);

                        c++;
                        d--;

                        // Skip duplicate third elements
                        while (c < d && arr[c] == arr[c - 1])
                            c++;

                        // Skip duplicate fourth elements
                        while (c < d && arr[d] == arr[d + 1])
                            d--;
                    }
                }
            }
        }

        return ans;
    }
}