class Solution {
    public int missingNumber(int[] nums) {
      int i = 0;
      while(i<nums.length){
        if(nums[i] == i || nums[i] == nums.length){
            i++;
        }else{
            int idx = nums[i];
            int temp = nums[i];
            nums[i] = nums[idx];
            nums[idx] = temp;
        }
      }
      for(int j = 0;j<nums.length;j++){
        if(nums[j] !=j){
            return j;
        }
      }
      return nums.length;
        
    }
}