import java.util.*;

class Solution {
    public int amountOfTime(TreeNode root, int start) {
        HashMap<TreeNode, TreeNode> parentMap = new HashMap<>();
        TreeNode startNode = buildParentMap(root, parentMap, start);
        Queue<TreeNode> queue = new LinkedList<>();
        HashSet<TreeNode> visited = new HashSet<>();
        queue.offer(startNode);
        visited.add(startNode);
        int time = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean burnedNewNode = false;
            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();
                if (curr.left != null && !visited.contains(curr.left)) {
                    visited.add(curr.left);
                    queue.offer(curr.left);
                    burnedNewNode = true;
                }
                if (curr.right != null && !visited.contains(curr.right)) {
                    visited.add(curr.right);
                    queue.offer(curr.right);
                    burnedNewNode = true;
                }
                if (parentMap.containsKey(curr)) {
                    TreeNode parent = parentMap.get(curr);
                    if (parent != null && !visited.contains(parent)) {
                        visited.add(parent);
                        queue.offer(parent);
                        burnedNewNode = true;
                    }
                }
            }
            if (burnedNewNode) {
                time++;
            }
        }
        return time;
    }
    private TreeNode buildParentMap(
            TreeNode root,
            HashMap<TreeNode, TreeNode> parentMap,
            int start) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        TreeNode startNode = null;
        while (!queue.isEmpty()) {
            TreeNode curr = queue.poll();
            if (curr.val == start) {
                startNode = curr;
            }
            if (curr.left != null) {
                parentMap.put(curr.left, curr);
                queue.offer(curr.left);
            }
            if (curr.right != null) {
                parentMap.put(curr.right, curr);
                queue.offer(curr.right);
            }
        }
        return startNode;
    }
}