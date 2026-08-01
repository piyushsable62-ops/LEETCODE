class Solution {
    public int[] mostCompetitive(int[] arr, int k) {
        Stack<Integer> st = new Stack<>();
        st.push(arr[0]);
        for(int i = 1;i<arr.length;i++){
            while(st.size() > 0 && st.peek()>arr[i] && st.size()+(arr.length-i)>k){
                st.pop();
            }
            if(st.size()<k){
                st.push(arr[i]);
            }
        }
        int[] ans = new int[st.size()];
        for (int j = st.size() - 1; j >= 0; j--) {
        ans[j] = st.pop();
        }
        return ans;
    }
}