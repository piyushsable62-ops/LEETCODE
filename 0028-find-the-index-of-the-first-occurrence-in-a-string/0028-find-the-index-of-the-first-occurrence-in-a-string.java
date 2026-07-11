class Solution {
    public int strStr(String haystack, String needle) {
        if(!haystack.contains(needle)){
            return -1;
        }
        int n = needle.length()-1;
        int i = 0;
        int j = 0;
        
        while(i<haystack.length() && j<haystack.length()){
             j = n+i;

          String ans = haystack.substring(i,j+1);
            if(ans.equals(needle)){
                return i;
            }
            i++;
          }
        
        return -1;
        
    }
    }
