
class Solution {
    
    public void flatten(TreeNode root) {
        ArrayList<TreeNode> ans = new ArrayList<>();
         if(root == null){
            return;
        }
        flat(root,ans);
        TreeNode temp = ans.get(0);
        
        for(int i = 1;i<ans.size();i++){
         temp.right = ans.get(i);
         temp.left = null;
         temp = temp.right;
        }
        temp.left = null;
        temp.right = null;
    
    }
    public void flat(TreeNode root,ArrayList<TreeNode> ans){
        if(root == null){
            return;
        }
        ans.add(root);
        flat(root.left,ans);
        flat(root.right,ans);
    
    }
}