class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count = (nums.length)/2;
        for(int i =0;i<nums.length;i++){
            int sum = 0;
            for(int j = i;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    sum++;
                }else{
                    break;
                }
            }
            if(sum > count){
                return nums[i];

            }

        }
        return 0;
        
    }
}