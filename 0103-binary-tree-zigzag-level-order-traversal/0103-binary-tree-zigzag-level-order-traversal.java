
public class Pair{
    TreeNode node;
    int level;
    Pair(TreeNode node,int level){
        this.node = node;
        this.level = level;
    }
}
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
        if(root == null){
            return ans;
        }
        Queue<Pair> q = new LinkedList<>();
        int currentlevel = 0;
        q.add(new Pair(root,0));
        ArrayList<Integer> list = new ArrayList<>();
        while(q.size() > 0){
            Pair front = q.remove();
            if(currentlevel != front.level){
             if(currentlevel%2 == 1){
                Collections.reverse(list);
                ans.add(list);
             }else{
                ans.add(list);
             }
             currentlevel++;
             list = new ArrayList<>();
            }
            list.add(front.node.val);
            if(front.node.left != null) q.add(new Pair(front.node.left,currentlevel+1));
            if(front.node.right != null) q.add(new Pair(front.node.right,currentlevel+1));
        }
            if(currentlevel%2 == 1){
                Collections.reverse(list);
                ans.add(list);
             }else{
                ans.add(list);
             }
             return ans;
    }
}