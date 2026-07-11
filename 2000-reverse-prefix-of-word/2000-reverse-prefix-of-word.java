class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder ans = new StringBuilder();
        int idx = -1;
        for(int i = 0;i<word.length();i++){
            if(word.charAt(i) == ch){
                idx = i;
                break;
            }
        }
        if(idx == -1){
            return word;
        }
       
        ans.append(word.substring(0,idx+1));
        ans.reverse();
        ans.append(word.substring(idx+1));
        return ans.toString();
        
    }
}