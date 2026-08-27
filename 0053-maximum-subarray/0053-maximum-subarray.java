class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int max = Integer.MIN_VALUE;
        int  i = 0;
         int sum = 0;
        while(i<nums.length){
        sum = sum + nums[i];
        max = Math.max(max,Math.max(nums[i],sum));
        if (sum < 0) {
         sum = 0;
        }
         i++;
        }
        return max; 
    }
}