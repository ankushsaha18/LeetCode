package Intermediate.DFS;
import Intermediate.Tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class PreOrderTraversal144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        function(root,ans);
        return ans;
    }
    public void function(TreeNode root,List<Integer> ans){
        if(root == null){
            return;
        }
        ans.add(root.val);
        function(root.left,ans);
        function(root.right,ans);
    }
}
