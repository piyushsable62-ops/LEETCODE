
class Solution {
    public int minDepth(TreeNode root) {
     return d(root);  
    }
    public int d(TreeNode root){
    if(root == null){
        return 0;
    }


    if(root.left == null){
        return 1+d(root.right);
    }
    if(root.right == null){
        return 1+d(root.left);
    }
         return 1+Math.min(d(root.left),d(root.right));

    }
}