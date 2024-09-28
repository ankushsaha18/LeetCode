package Intermediate.DFS;
import Intermediate.Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class InOrderTraversal94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        function(root,ans);
        return ans;
    }
    public void function(TreeNode root,List<Integer> ans){
        if(root == null){
            return;
        }
        function(root.left,ans);
        ans.add(root.val);
        function(root.right,ans);
    }
}
