class Solution {
    public char findTheDifference(String s, String t) {

        int char_s = 0;
        int char_t= 0;

        for (int i = 0; i < s.length(); i++)
        {
            char_s = char_s + s.charAt(i);
        }

        for (int i = 0; i < t.length(); i++) 
        {
            char_t =char_t + t.charAt(i);
        }

        char ans = (char)(char_t - char_s);

        return ans;
    }
}