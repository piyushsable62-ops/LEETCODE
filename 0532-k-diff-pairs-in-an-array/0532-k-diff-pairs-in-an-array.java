class Solution {
    public int findPairs(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : nums){
            if(!map.containsKey(ele)){
                map.put(ele,1);
            }else{
                map.put(ele,map.get(ele)+1);
            }
        }
        int count =  0  ;
        for(int ele : map.keySet()){
            if(k == 0){
            if(map.get(ele) > 1){
                count++;
            }
        }else{
            int rem = ele+k;
            if(map.containsKey(rem)){
                count++;
            }
        }
        }
        return count;
        // HashSet<Integer> set = new HashSet<>();
        // int count = 0;
        // int count1 = 0;
        // for (int ele: nums){
        //     if(set.contains(ele)) count1++;
        //     set.add(ele);
        // }
        // if(k == 0){
        //     return count1;
        // }
       
        // for (int ele : set) {
        // if (set.contains(ele + k)) {
        // count++;
        // }
        // }
        // return count; 
    }
}