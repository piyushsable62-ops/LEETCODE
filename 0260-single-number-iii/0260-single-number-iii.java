class Solution {
    public int[] singleNumber(int[] nums) {
        int ans = 0;
        for(int i = 0;i<nums.length;i++){
            ans^=nums[i];
        }
        int result = ((ans&(ans-1))^ans);
        int ans1 = 0;
        int ans2 = 0;
        for(int i = 0;i<nums.length;i++){
            if((nums[i] & result) != 0 ){
                ans1 ^= nums[i];
            }else{
                ans2^=nums[i];
            }
        }
        return new int[]{ans1,ans2};
    
        
    }
}