class Solution {
    public int minPartitions(String n) {
      int max = 0;
      int ans = 0;
      for(int i = 0 ;i<n.length();i++){
        ans = Math.max(ans,n.charAt(i)-'0');
      }
      return ans;
    }
}