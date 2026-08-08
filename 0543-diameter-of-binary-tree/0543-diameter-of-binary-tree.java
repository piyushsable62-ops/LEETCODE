
class Solution {
    int height = 0;
    public int diameterOfBinaryTree(TreeNode root) {
     level(root);
     return height;  
    }
    public int level(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = level(root.left);
        int right = level(root.right);
        height = Math.max(height,left+right);
        return 1+Math.max(left,right);
    }
}