class Solution {
    public List<Integer> findClosestElements(int[] nums, int k, int x) {
       PriorityQueue<Integer> pq = new PriorityQueue<>(
    (a, b) -> Math.abs(b - x) - Math.abs(a - x)
);
        for(int i = 0;i<nums.length;i++){
            if(pq.size() < k){
                pq.add(nums[i]);
            }else{
                int p = nums[i];
                int q = pq.peek();
                if(Math.abs(p-x) < Math.abs(q-x)){
                    pq.remove();
                    pq.add(nums[i]);
                }
            }
            }
            ArrayList<Integer> ans = new ArrayList<>();
            while(pq.size()>0){
            ans.add(pq.remove());
            }
        Collections.sort(ans);
        return ans;
    }
}