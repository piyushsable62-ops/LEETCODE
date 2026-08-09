
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
       ArrayList<Integer> ans = new ArrayList<>();
       rsv(root,0,ans);
       return ans;
    }
    public void rsv(TreeNode root,int level,ArrayList<Integer> ans){
        if(root == null){
            return ;
        }
        int node = root.val;
        int currentlevel = 0;
        if(level == ans.size()){
            ans.add(node);
            currentlevel = level;
            
        }
        rsv(root.right,level+1,ans);
        rsv(root.left,level+1,ans);
    }
}