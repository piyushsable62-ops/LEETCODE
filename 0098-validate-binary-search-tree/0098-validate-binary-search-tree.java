
class Solution {
    long k = Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
    if(root == null){
        return true;
    }
        if (!isValidBST(root.left)) {
            return false;
        }
    if(root.val > k){
        k = root.val;
    }else {
        return false;
    }
     if (!isValidBST(root.right)) {
            return false;
     }
    return true;
    }
    }
    // public boolean vbb(TreeNode root){
    //     if(root ==  null){
    //         return true;
    //     }
    //     if(root.left != null){
    //         if(root.left.val >= root.val){
    //             return false;
    //         }
    //     vbb(root.left);
    //     } if(root.right != null){
    //         if(root.right.val <= root.val){
    //             return false;
    //         }
    //     vbb(root.right);
    //     }
    //     return true;
    // }
    
// }