class Solution {
    static int count;
    static int inversionCount(int arr[]) {
      
        count = 0;
        mergesort(arr);
        return count;
        
        
        
        
    }
    public static void mergesort(int[] arr){
          if(arr.length <= 1) return;
        int n = arr.length;
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        int idx = 0;
        for(int i = 0;i<a.length;i++){
            a[i] = arr[idx++];
        }
        for(int j = 0;j<b.length;j++){
            b[j] = arr[idx++];
        }
        mergesort(a);
        mergesort(b);
        merge(a,b,arr);
        
    }
    public static void merge(int[] a,int[] b , int[] c){
            int i = 0,j=0,k=0;
            while(i<a.length && j < b.length){
                if(a[i]<=b[j]){
                    c[k++] = a[i++];
                    
                }else{
                    c[k++] = b[j++];
                    count += a.length-i;
                }
            }
            while(i<a.length){
                c[k++] = a[i++];
            }
            while(j<b.length){
                c[k++] = b[j++];
            }
    }
    
}