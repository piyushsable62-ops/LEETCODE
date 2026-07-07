class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for(int k = 0;k<= nums.length;k++){
            int x = k;
            int i = 0;
            int j = nums.length-1;
            while(i<=j){
                int mid = (j-i)/2+i;
                if( nums[mid] >= x){
                   
                    j = mid-1;
                }else{
                 
                    i = mid+1;
                }
            }
             count = nums.length-1-j;
            if(x == count){
            return x;
            }
        }return -1;
        
    }
}