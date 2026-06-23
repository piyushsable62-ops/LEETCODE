class Solution {
    public void moveZeroes(int[] arr) {
        // for(int i = 0;i<nums.length;i++){
        //     for(int j = 0; j<nums.length-1;j++){
        //         if(nums[j] == 0 ){
        //             int temp = nums[j];
        //             nums[j] = nums[j+1];
        //             nums[j+1] = temp;

        //         }
        //     }
        // }
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] != 0){
                list.add(arr[i]);
            }else{
                count++;
            }
            
        }
        for(int i = 0 ;i<count;i++){
            list.add(0);
        }
        for(int j = 0;j <arr.length;j++){
            
                arr[j] = list.get(j) ;
            
        }
       
       

        
    }
}
