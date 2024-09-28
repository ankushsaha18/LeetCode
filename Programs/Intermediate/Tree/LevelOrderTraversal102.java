package Intermediate.Tree;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode value = q.remove();
                level.add(value.val);
                if (value.left != null) {
                    q.add(value.left);
                }
                if (value.right != null) {
                    q.add(value.right);
                }
            }
            ans.add(new ArrayList(level));
        }
        return ans;
    }
}
