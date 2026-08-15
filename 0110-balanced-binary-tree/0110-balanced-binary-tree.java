
class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        int left = 0;
        int right = 0;
        if(root.left != null){
             left = d(root.left);
        }
        if(root.right != null){
             right = d(root.right);
        }
        if(Math.abs(left-right)>=2){
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }
    public int d(TreeNode root){
        if(root == null){
            return 0;
        }
    return 1+Math.max(d(root.left) , d(root.right));
    }
}