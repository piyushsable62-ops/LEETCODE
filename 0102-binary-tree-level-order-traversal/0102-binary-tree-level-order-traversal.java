 public class Pair{
  TreeNode node;
  int level;
  Pair( TreeNode node,int level){
    this.level = level;
    this.node = node;
  }
}

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<List<Integer>> ans = new ArrayList<>();
        Queue<Pair> q = new LinkedList<>();
          if (root == null) {
            return ans;
        }
        int currentlevel = 0;
        q.add(new Pair(root,0));
       ArrayList<Integer> list = new ArrayList<>();
        while(q.size()>0){
        Pair front = q.remove();
        
        
        if(currentlevel != front.level){
            currentlevel++;
            ans.add(list);
            list = new ArrayList<>();
        }
        list.add(front.node.val);
        if(front.node.left != null) q.add(new Pair(front.node.left,currentlevel+1));
        if(front.node.right != null) q.add(new Pair(front.node.right,currentlevel+1));

        }
        ans.add(list);
        return ans;
    }
}