
class Solution {
    int sum = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        return inorder(root,low,high);
        
    }public int inorder(TreeNode root,int low,int high){
        if(root == null){
            return sum;
        }
        inorder(root.left,low,high);
        if(root.val >= low && root.val<=high){
            sum+=root.val;
        }
        inorder(root.right,low,high);
        return sum;
    }
}