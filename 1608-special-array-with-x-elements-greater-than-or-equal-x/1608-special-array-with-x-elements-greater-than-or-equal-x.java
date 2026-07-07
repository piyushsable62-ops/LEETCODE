// class Solution {
//     public int specialArray(int[] nums) {
//         Arrays.sort(nums);
//         int count = 0;
//         for(int k = 0;k<= nums.length;k++){
//             int x = k;
//             int i = 0;
//             int j = nums.length-1;
//             while(i<=j){
//                 int mid = (j-i)/2+i;
//                 if( nums[mid] >= x){
                   
//                     j = mid-1;
//                 }else{
                 
//                     i = mid+1;
//                 }
//             }
//              count = nums.length-1-j;
//             if(x == count){
//             return x;
//             }
//         }return -1;
        
//     }
// }
// gpt soln
class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int count = n - i;

            if (nums[i] >= count &&
                (i == 0 || nums[i - 1] < count)) {
                return count;
            }
        }

        return -1;
    }
}