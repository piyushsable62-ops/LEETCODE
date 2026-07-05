class Solution {
    public int findFloor(int[] arr, int target) {
       
        int low = 0;
        int high = arr.length-1;
        int idx = -1;
        while(low<=high){
            int mid = (high-low)/2+low;
            if(arr[mid]> target){
                high = mid -1;
            }else{
                idx = mid;
                low = mid +1;
                
               
        
    }
        }
 
    return idx;
    
    }
}
