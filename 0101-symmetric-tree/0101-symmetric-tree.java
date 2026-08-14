class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        rotate(root.left);
        return sameTree(root.left, root.right);
    }
    public void rotate(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        rotate(root.left);
        rotate(root.right);
    }
    public boolean sameTree(TreeNode a, TreeNode b) {
        if (a == null && b == null) {
            return true;
        }
        if (a == null || b == null) {
            return false;
        }
        if (a.val != b.val) {
            return false;
        }
        return sameTree(a.left, b.left) &&
               sameTree(a.right, b.right);
    }
}