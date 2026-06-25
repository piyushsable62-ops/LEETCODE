class Solution {
    public int firstMissingPositive(int[] nums) {
       Arrays.sort(nums);
       int i = 0;
       int k = 1;
       
       while(i<nums.length){
        if(nums[i] <= 0){
            i++;

        }else{
            for(int j = i ;j<nums.length;j++){
                if(nums[j] == k ){
                    k++;
                    i++;
                }else if (nums[j]<k){
                    i++;
                  
                }else{
                      return k;
                }
                
                
            }
        }
       }
       return k++;

    }
}