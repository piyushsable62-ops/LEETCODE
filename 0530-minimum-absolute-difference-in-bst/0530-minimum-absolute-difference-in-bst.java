
class Solution {
    int prev = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;  
    public int getMinimumDifference(TreeNode root) {
     return inorder(root);
    }
    public int inorder(TreeNode root){
        if(root == null){
            return 0;
        }
       inorder(root.left);
       int current = root.val;
       if(prev != Integer.MIN_VALUE){
        int ans = Math.abs(current-prev);
       if(min>ans){
        min = ans;
       } 
       }
       prev = current;
       inorder(root.right);
       return min;
    }
}