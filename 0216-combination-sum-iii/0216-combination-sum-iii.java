class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
        for(int i = 1;i<=9;i++){
            ArrayList<Integer> list = new ArrayList<>();
            list.add(i);
            helper(list,ans,i+1,i,n,k);
            
        }
        return ans;    
    }
    public void helper(ArrayList<Integer> list,ArrayList<List<Integer>> ans,int idx,int sum,int target,int k){
        if(sum == target && list.size() == k){
            ans.add(new ArrayList<>(list));
            return;
        }
        if(idx>9 || sum>target || list.size() > k){
            return;
        }
        for(int i = idx;i<=9;i++){
            list.add(i);
            helper(list,ans,i+1,sum+i,target,k);
            list.remove(list.size()-1);
        }
    }
}