class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        Arrays.sort(nums);

        int n = nums.length;
        int i = 1;

        while (i < n) {
            if (nums[i] == nums[i - 1]) {
                list.add(nums[i]);
            }
            i++;
        }

        return list;
    }
}