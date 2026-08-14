
class Solution {
    public int maxDepth(TreeNode root) {
     return depth(root,0);

    }
    public int depth(TreeNode root,int level){
        if(root == null){
            return 0;
        }
        return 1+Math.max(depth(root.left,level+1),depth(root.right,level+1));
    }
}