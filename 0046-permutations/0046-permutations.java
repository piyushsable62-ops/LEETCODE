import java.util.*;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        backtrack(nums, new ArrayList<>(), new boolean[nums.length], result);

        return result;
    }

    private void backtrack(
        int[] nums,
        List<Integer> current,
        boolean[] used,
        List<List<Integer>> result
    ) {
        // If permutation contains all numbers
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Try each number
        for (int i = 0; i < nums.length; i++) {

            // Skip if already used
            if (used[i]) {
                continue;
            }

            // Choose
            current.add(nums[i]);
            used[i] = true;

            // Explore
            backtrack(nums, current, used, result);

            // Undo choice
            current.remove(current.size() - 1);
            used[i] = false;
        }
    }
}