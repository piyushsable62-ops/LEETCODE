class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
        int i = 0;
        while(i<n){
            int correct = nums[i]-1;
            if(nums[i] == i+1   ||     nums[i] == nums[correct]){
                  i++;
               
            }else{
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }
           
        }
        for( i = 0;i<nums.length;i++){
            if(nums[i] != i+1){
                list.add(i+1);
            }
        }
        return list;
        
    }
}