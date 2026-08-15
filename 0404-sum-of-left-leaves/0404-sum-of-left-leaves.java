class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return ls(root.left, 0, true) + ls(root.right, 0, false);
    }
    public int ls(TreeNode root, int sum, boolean isLeft) {
        if (root == null) {
            return sum;
        }
        if (root.left == null && root.right == null && isLeft) {
            sum += root.val;
        }
        sum = ls(root.left, sum, true);
        sum = ls(root.right, sum, false);
        return sum;
    }
}