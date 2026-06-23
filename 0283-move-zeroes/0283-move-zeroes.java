class Solution {
    public void moveZeroes(int[] nums) {
        for(int i = 0;i<nums.length;i++){
            for(int j = 0; j<nums.length-1;j++){
                if(nums[j] == 0 ){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;

                }
            }
        }
        // ArrayList<Integer> arr = new ArrayList<>();
        // int count = 0;
        // for(int i = 0 ; i<nums.length ;i++){
        //     if(nums[i] != 0){
        //         arr.add(nums[i]);
        //     }else{
        //         count++;
        //     }
        // }
        // for(int j = 0; j<count;j++){
        //     arr.add(0);
        // }
        // for(int k = 0 ; k<nums.length ;k++ ){
        //     nums[k] = arr.get(k);

        // }

        
    }
}
