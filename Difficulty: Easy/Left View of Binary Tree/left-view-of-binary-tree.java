
class Solution {
    public ArrayList<Integer> leftView(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        lsv(root,0,ans);
        return ans;
    }
    public void lsv(Node root,int level,ArrayList<Integer> ans){
        if(root == null){
            return ;
        }
        int data = root.data;
        if(level == ans.size()){
            ans.add(data);
        }
        lsv(root.left,level+1,ans);
        lsv(root.right,level+1,ans);
    }
}