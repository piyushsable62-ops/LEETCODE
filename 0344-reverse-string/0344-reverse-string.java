class Solution {
    public void reverseString(char[] s) {
        swap(s,0,s.length-1);
        
    }
    public void swap(char[] arr,int i,int j){

            if(i>=j){
                return ;
            }
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            swap(arr,i+1,j-1);
            
        
    }
}