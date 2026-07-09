class Solution {
    public int findMin(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        while(i<=j){
            int mid = (j-i)/2+i;
            if( mid>0 && nums[mid] < nums[mid-1]){
                return nums[mid];
            }
            if(nums[mid] > nums[j]){
                i = mid+1;
            }else if(nums[mid]<nums[j]){
                j = mid;
            }else{
                j--;
            }
        }
        return nums[0];
        
    }
}