class Solution {
    public int[] asteroidCollision(int[] arr) {
        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            if (st.size() > 0 && st.peek() > 0 && current < 0) {
                while (st.size() > 0 && st.peek() > 0 && (-current > st.peek())) {
                    st.pop();
                }
                if (st.size() == 0 || st.peek() < 0) {
                    st.push(current);
                } else if (st.peek() == -current) {
                    st.pop();
                }
            } else {
                st.push(current);
            }
        }
        int[] ans = new int[st.size()];
        int i = st.size() - 1;
        while (!st.empty()) {
            ans[i] = st.pop();
            i--;
        }
        return ans;
    }
}