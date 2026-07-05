class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ind1 = -1;
        int ind2 = -1;
        int i = 0;
        int j = nums.length-1;
        while(i<=j){
            int mid = (j-i)/2+i;
            if(nums[mid]>target){
                j = mid -1;
            }else if (nums[mid] < target){
                i = mid +1;
            }else {
                ind1 = mid;
                j = mid-1;
            }
        }
        i = 0;
        j = nums.length-1;
         while(i<=j){
            int mid = (j-i)/2+i;
            if(nums[mid]>target){
                j = mid -1;
            }else if (nums[mid] < target){
                i = mid +1;
            }else {
                ind2 = mid;
                i = mid+1;
            }
        }
        return new int[]{ind1,ind2};

        
    }
}