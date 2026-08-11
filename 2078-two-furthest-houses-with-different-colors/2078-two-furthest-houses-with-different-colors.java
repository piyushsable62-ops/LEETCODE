class Solution {
    public int maxDistance(int[] ans) {
        int i = 0;
        int j = ans.length-1;
        int ans1 = 0;
        int ans2 = 0;
        while(i<j){
            if(ans[i] != ans[j]){
            ans1 =  j-i;
            break;
            }
            j--;
        }
         i = 0;
         j = ans.length-1;
        while(i<j){
            if(ans[i] != ans[j]){
            ans2 =  j-i;
            break;
            }
            i++;
        }
        return Math.max(ans1,ans2);
        
    }
}