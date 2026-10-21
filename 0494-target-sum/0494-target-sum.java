class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return target(0,target,nums);
    }
    public int target(int i ,int target,int[] nums){
        if(i == nums.length){
            if(target == 0){
                return 1;
            }else{
                return 0;
            }
        }
            int add = target(i+1,target-nums[i],nums);
            int sub = target(i+1,target+nums[i],nums);
        return add+sub;
    }
}