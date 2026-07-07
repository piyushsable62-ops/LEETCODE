class Solution {
    public int findMin(int[] nums) {
    //     int x = binary(nums);


    //     if(nums.length == 0 || x == 0){
    //         return nums[0];
    //     }
    //     swap(nums,0,x-1);
    //     swap(nums,x,nums.length-1);
    //     swap(nums,0,nums.length-1);
    //     return nums[0];
    // }
    // public int binary(int[] arr){
    //     int i = 0;
    //     int j = arr.length-1;
    //     int x = 0;
    //     while(i<=j){
    //         int mid = (j-i)/2+i;
           
    //         if( mid>0 && arr[mid] < arr[mid-1]){
    //             x = mid;
    //             return mid;
               
    //         }
            
    //         else if(arr[mid] >= arr[0]){
    //             i = mid+1;
    //         }else {
    //             j = mid -1;
    //         }
    //     }
    //     return x;
        
       
    // }
    // public void swap(int[] arr,int i ,int j){
    //   while(i<=j){
    //     int temp = arr[i];
    //     arr[i] = arr[j];
    //     arr[j] = temp;
    //     i++;
    //     j--;
    //   }
   if(nums.length == 1){
    return nums[0];

   }
     
   int i = 0;
   int j = nums.length-1;
   while(i<=j){
    int mid = (j-i)/2+i;
    if(mid>0 && nums[mid-1] > nums[mid]){
        return nums[mid];
    }else if(nums[mid] >= nums[0]){
        i = mid+1;
    }else{
        j = mid-1;
    }

   }
   return nums[0];

    }
}