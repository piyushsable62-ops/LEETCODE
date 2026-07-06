class Solution {
    public int search(int[] arr, int target) {
        int i = 0;
        int j = arr.length-1;
        while(i<=j){
            int mid = (j-i)/2+i;
            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] >= arr[i]){
                if(arr[i] <= target && target < arr[mid]){
                    j = mid-1;
                }else{
                    i = mid+1;
                }
            }else {
                if( arr[mid] < target && target <= arr[j]){
                    i = mid+1;
                }else{
                    j = mid-1;
                }
            }
        }
        return -1;
        
    }
}