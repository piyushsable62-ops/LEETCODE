class Solution {
    public boolean containsDuplicate(int[] nums) {
    //   for(int i = 0;i<nums.length;i++){
    //     for(int j = 0;j<nums.length-1-i;j++){
    //         if(nums[j] > nums[j+1]){
    //             int temp = nums[j];
    //             nums[j] = nums[j+1];
    //             nums[j+1] = temp;
    //         }
    //     }
    //   }
    Arrays.sort(nums);
      for(int i = 0 ; i<nums.length-1;i++){
        
            if(nums[i] == nums[i+1]){
                return true;
        }
        } 
       return false;    
    }
}