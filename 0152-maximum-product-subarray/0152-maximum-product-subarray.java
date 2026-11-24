class Solution {
    public int maxProduct(int[] nums) {
        // int max = Integer.MIN_VALUE;
        // for(int i = 0;i<nums.length;i++){
        //     int product = 1;
        //     for(int j = i;j<nums.length;j++){
        //       product*=nums[j];
        //       max = Math.max(product,max);
        //     }
        // }
        // return max;
       int maxProd = nums[0];
        int minProd = nums[0];
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            if (num < 0) {
                int temp = maxProd;
                maxProd = minProd;
                minProd = temp;
            }
            maxProd = Math.max(num, maxProd * num);
            minProd = Math.min(num, minProd * num);
            ans = Math.max(ans, maxProd);
        }
        return ans;
    }
}
    