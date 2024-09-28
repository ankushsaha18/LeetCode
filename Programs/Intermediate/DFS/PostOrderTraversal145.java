package Intermediate.DFS;
import Intermediate.Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PostOrderTraversal145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        function(root,ans);
        return ans;
    }
    public void function(TreeNode root,List<Integer> ans){
        if(root == null){
            return;
        }
        function(root.left,ans);
        function(root.right,ans);
        ans.add(root.val);
    }
}
