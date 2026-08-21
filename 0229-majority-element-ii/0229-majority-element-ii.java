class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        if(nums.length == 1){
            ans.add(nums[0]);
            return ans;
        }
        int i = 0;
        int j = i;
        int count = 0;
        while(i< nums.length && j<nums.length){
            if(nums[i] == nums[j]){
                count++;
                j++;
            }else {
                if(count > (nums.length)/3){
                    ans.add(nums[i]);
                }
                  i = j;
                  count = 0;
            }
        }
        if(count > (nums.length)/3){
            ans.add(nums[i]);
        }
        return ans;
        
    }
}