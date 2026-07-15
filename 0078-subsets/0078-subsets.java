class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        recersion(ans, nums, 0, result);

        return result;
    }

    public void recersion(List<Integer> ans, int[] nums, int idx, List<List<Integer>> result) {

        if (idx == nums.length) {
            result.add(new ArrayList<>(ans));
            return;
        }

        int x = nums[idx];

        ans.add(x);
        recersion(ans, nums, idx + 1, result);

        ans.remove(ans.size() - 1);
        recersion(ans, nums, idx + 1, result);
    }
}   