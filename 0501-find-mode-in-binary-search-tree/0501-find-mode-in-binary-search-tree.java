class Solution{
    int max = 0;
    int count = 0;
    int prev = Integer.MIN_VALUE;
public int[] findMode(TreeNode root) {

    ArrayList<Integer> ans = new ArrayList<>();
    if (root == null) {
        return new int[0];
    }
    count(root, ans);
    if (count > max) {
        ans.clear();
        ans.add(prev);
    } 
    else if (count == max) {
        ans.add(prev);
    }
    int[] list = new int[ans.size()];
    for (int i = 0; i < ans.size(); i++) {
        list[i] = ans.get(i);
    }
    return list;
}
    public ArrayList<Integer> count(TreeNode root,ArrayList<Integer> ans){
        if(root == null){
            return ans; 
        }
        count(root.left,ans);
        
       int current = root.val;
        if(current == prev){
            count++;
        }else{
            if(count> max){
                ans.clear();
                max = count;
                ans.add(prev);
            }else if(count == max){
                ans.add(prev);
            }
            count = 1;
            }
        prev = current;
        count(root.right,ans);
        return ans; 
        
        }
}