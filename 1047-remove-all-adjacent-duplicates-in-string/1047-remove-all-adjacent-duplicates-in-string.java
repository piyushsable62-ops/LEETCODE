class Solution {
    public String removeDuplicates(String s) {
    int n = s.length();
    Stack<Character> st = new Stack<>();
    for(int i = 0;i<n;i++){
        char ans = s.charAt(i);
        if(st.size() == 0){
            st.push(ans);
        }else{
            char top = st.peek();
            if(ans == top){
                st.pop();
            }else{
                st.push(ans);
            }
        }

    }
    Stack<Character> list = new Stack<>();
    while(!st.isEmpty()){
    list.push(st.pop());
   }
    String ans = "";
    while(!list.isEmpty()){
    ans += list.pop();
    }
    return ans;     
        
    }
}