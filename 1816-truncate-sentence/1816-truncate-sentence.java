class Solution {
    public String truncateSentence(String s, int k) {
       String ans = "";
       int space = 0;
       for(int i = 0;i<s.length();i++){
       char a = s.charAt(i);
       if(a == ' '){
        space++;
        if(space == k){
            return ans;
        }
       }
       ans+=a;
       }
       return ans;
    }
}