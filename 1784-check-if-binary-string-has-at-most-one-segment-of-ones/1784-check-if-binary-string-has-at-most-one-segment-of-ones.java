class Solution {
    public boolean checkOnesSegment(String s) {

        int i = 0;
        int j = 0;
        if(s.length() == 1){
            return true;
        }

        while (i < s.length()) {
            char ans = s.charAt(i);

            if (ans == '1') {
                i++;
            } else {
                j = i;
                break;
            }
        }
          if (i == s.length()) {
            return true;
        }

        while (j < s.length()) {
            char ans1 = s.charAt(j);

            if (ans1 == '0') {
                j++;
            } else {
                return false;
            }
        }

        return true;
    }
}