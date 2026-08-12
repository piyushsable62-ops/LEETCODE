
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
         List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        return tree(root,targetSum,ans,0,list);
        
    }
    public List<List<Integer>> tree(TreeNode root,int targetSum, List<List<Integer>> ans,int sum, ArrayList<Integer> list){
         if(root == null){
            return ans;
        }
        sum +=root.val;
        list.add(root.val);
        if(root.right == null && root.left == null){
            if(sum == targetSum){
                ans.add(new ArrayList<>(list));
            }
        }
        
        tree(root.left, targetSum, ans, sum, list);
        tree(root.right, targetSum, ans, sum, list);
        list.remove(list.size() - 1);
        return ans;
    }
}