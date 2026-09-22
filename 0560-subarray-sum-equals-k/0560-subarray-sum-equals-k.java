class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // Prefix sum 0 has occurred once before the array starts
        map.put(0, 1);
        int sum = 0;
        int count = 0;
        for (int ele : nums) {
            // Current prefix sum
            sum += ele;
            // Prefix sum we need to find
            int diff = sum - k;
            // If we have seen this prefix sum before,
            // each occurrence gives us one valid subarray
            if (map.containsKey(diff)) {
                count += map.get(diff);
            }
            // Store current prefix sum and its frequency
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}