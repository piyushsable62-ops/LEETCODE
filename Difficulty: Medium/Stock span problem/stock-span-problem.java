class Solution {
    public ArrayList<Integer> calculateSpan(int[] arr) {
      Stack<Integer> st = new Stack<>();
      int[] ans = new int[arr.length];
      ans[0] = 1;
      st.push(0);
      for(int i = 1;i<arr.length;i++){
          while(st.size()>0 &&  arr[st.peek()] <= arr[i]){
             st.pop();
          }
          if(st.size() == 0){
              st.push(i);
              ans[i] = i+1;
          }else{
              ans[i] = i-st.peek();
            st.push(i);
          }
      }
      ArrayList<Integer> list = new ArrayList<>();
      
      for(int i = 0;i<ans.length;i++){
          list.add(ans[i]);
      }
      return list;
        
    }
}