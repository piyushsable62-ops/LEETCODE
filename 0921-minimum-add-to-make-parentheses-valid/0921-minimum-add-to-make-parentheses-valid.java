class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0;i<s.length();i++){
            char ans = s.charAt(i);
            if(ans == '('){
                st.push(ans);
            }else{
             if(st.size() >0 && st.peek() == '('){
                st.pop();
             }else{
                st.push(ans);
             }
            }
        }
        return st.size();
        
    }
}