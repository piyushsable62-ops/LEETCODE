
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){
            return new TreeNode(val);
        }
        attach(root,val);
        return root;
    }
    public void attach(TreeNode root,int val){
        if(root == null){
            return ;
        }
        if(root.left == null && root.right == null){
          TreeNode t = new TreeNode(val);
            if(root.val < val){
                root.right = t;
            }else{
                root.left = t; 
            }
            return;
        }
        if(root.val < val){
            if(root.right == null){
                root.right = new TreeNode(val);
                return;
            }
            attach(root.right,val);
        }else if(root.val>val){
             if(root.left == null){
                root.left = new TreeNode(val);
                return;
            }
            attach(root.left,val);
        }else {
            return;
        }
        

    }
}