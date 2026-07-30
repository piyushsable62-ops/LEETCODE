class Solution {
    public boolean find132pattern(int[] nums) {

        Stack<Integer> st = new Stack<>();
        int second = Integer.MIN_VALUE;

        st.push(nums[nums.length - 1]);

        for (int i = nums.length - 2; i >= 0; i--) {

            if (nums[i] < second) {
                return true;
            }

            while (!st.isEmpty() && nums[i] > st.peek()) {
                second = st.pop();
            }

            st.push(nums[i]);
        }

        return false;
    }
}