// class Solution {
//     public List<List<Integer>> threeSum(int[] arr) {

//       Arrays.sort(arr);  
//       ArrayList<List<Integer>> ans = new ArrayList<>();
//       int k = 0;
//       while(k<arr.length-2){
//         int i = k+1;
//         int j = arr.length-1;
//         while(i<j){
//         if(arr[k] + arr[i] + arr[j] > 0 ){
//             j--;
//         }else if ((arr[k] + arr[i] + arr[j] < 0 )){
//             i++;
//         }else{
//             ArrayList<Integer> list = new ArrayList<>();
//             list.add(arr[k]);
//             list.add(arr[i]);
//             list.add(arr[j]);
            
         
//        if(!ans.contains(list)){
//         ans.add(list);
//        }
//        i++;
//        j--;
//         }

//       } 
      
//        k++;
//       } 
//       return ans;
        
//     }
// }
class Solution {
    public List<List<Integer>> threeSum(int[] arr) {

        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();

        int k = 0;

        while (k < arr.length - 2) {

            // Skip duplicate first elements
            if (k > 0 && arr[k] == arr[k - 1]) {
                k++;
                continue;
            }

            int i = k + 1;
            int j = arr.length - 1;

            while (i < j) {

                int sum = arr[k] + arr[i] + arr[j];

                if (sum > 0) {
                    j--;
                } else if (sum < 0) {
                    i++;
                } else {

                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(arr[k]);
                    list.add(arr[i]);
                    list.add(arr[j]);
                    ans.add(list);

                    i++;
                    j--;

                    // Skip duplicate second elements
                    while (i < j && arr[i] == arr[i - 1]) {
                        i++;
                    }

                    // Skip duplicate third elements
                    while (i < j && arr[j] == arr[j + 1]) {
                        j--;
                    }
                }
            }

            k++;
        }

        return ans;
    }
}