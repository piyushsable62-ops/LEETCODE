
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        inorder(root,ans);
        return ans.get(k-1);
    }
    public ArrayList<Integer> inorder(TreeNode root,ArrayList<Integer> ans){
        if(root == null){
            return ans;
        }
        inorder(root.left,ans);
        ans.add(root.val);
        inorder(root.right,ans);
        return ans;
    }
}