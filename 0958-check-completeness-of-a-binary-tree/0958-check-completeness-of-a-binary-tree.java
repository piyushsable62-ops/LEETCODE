
class Solution {
    public boolean isCompleteTree(TreeNode root) {
       int size = size(root); 
       return iscbt(root,1,size);
    }
    public boolean iscbt(TreeNode root,int idx,int size){
        if(root == null){
            return true;
        }
        if(idx>size){
            return false;
        }
        return iscbt(root.left,idx*2,size) && iscbt(root.right,2*idx+1,size);
    }
    public int size( TreeNode root){
        if(root == null){
            return 0;
        }
        return 1+size(root.left)+size(root.right);
    }
}