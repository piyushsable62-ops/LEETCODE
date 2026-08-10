class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
//       if(root == null){
//         return null;
//       }
//       if(root == p || root == q){
//         return root;
//       }
//       boolean left = lsc(root.left,p);
//       boolean right = lsc(root.right,q);
//       if(left == true && right == true){
//         return root;
//       }else if (left == false && right == false){
//         return root;
//       }else if (left == true && right == false) {
//        return  lowestCommonAncestor(root.left,p,q);
//       }else{
//          return lowestCommonAncestor(root.right,p,q);
//       }
    
//     }
//     public boolean lsc(TreeNode root,TreeNode p){
//         if(root == null){
//             return false;
//         }
//         if(root == p){
//             return true;
//         } 
//         return  lsc(root.left,p) || lsc(root.right,p);
    if(root == null){
        return null;
    }
    if(root == p || root == q){
        return root;
    }
    TreeNode left = lowestCommonAncestor(root.left,p,q);
    TreeNode right = lowestCommonAncestor(root.right,p,q);
    if(left != null && right != null){
        return root;
    }else if(left == null && right != null){
        return right;
    }else{
        return left;
    }
    }
 }