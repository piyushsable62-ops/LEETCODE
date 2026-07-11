class Solution {
    public String mergeAlternately(String word1, String word2) {
        String ans = "";
        int j = 0;
        while(j<word1.length() && j<word2.length()){
        ans+=word1.charAt(j);
        ans+=word2.charAt(j);
        j++;
        }
        while(j<word1.length()){
            ans+=word1.charAt(j);
            j++;

        }while(j<word2.length()){
            ans+=word2.charAt(j);
            j++;
        }
        return ans;
        
    }
}