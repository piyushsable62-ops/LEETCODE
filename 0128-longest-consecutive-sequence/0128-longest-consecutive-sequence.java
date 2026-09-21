class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> ans = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            ans.add(nums[i]);
        }
        int max = 0;
        for(int x : ans){
            int current = x;
            int count = 1;
            if(!ans.contains(current-1)){
            while(ans.contains(current+1)){
                current = current+1;
                count++;
            }
            }
            if(count>max){
                max = count;
            }
            
        }
        return max;
    }
}