class Solution {
    public int[] canSeePersonsCount(int[] arr) {
//         int[] ans = new int[arr.length];
//         for(int i = 0;i<arr.length;i++){
//             int count = 0;
//             int max = Integer.MIN_VALUE;
//             for(int j = i+1;j<arr.length;j++){
//                 if (arr[j] > max) {
//                 count++;
//                 max = arr[j];
//         }
//         if(arr[j] >= arr[i]) {
//             break;
//         }
//         }
//             ans[i] = count;
//         }
//         return ans;
        
//     }
// }
    Stack<Integer> st = new Stack<>();
    int n = arr.length;
    st.push(arr[n-1]);
    int[] ans = new int[n];
     ans[n-1] = 0;
    for(int i = n-2;i>=0;i--){
        int count = 0;
        while(st.size() > 0 && arr[i] > st.peek()){
            st.pop();
            count++;
        }
        if(st.size() == 0){
            st.push(arr[i]);
        }else{
            count++;
            st.push(arr[i]);
        }
        ans[i] = count;
        
    }
    return ans;



        }
}