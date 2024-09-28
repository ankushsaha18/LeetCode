package Intermediate.DFS;

import Intermediate.Tree.TreeNode;

public class BalancedTree110 {
    public boolean isBalanced(TreeNode root) {
        return dfsheight(root) != -1;
    }
    public int dfsheight(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = dfsheight(root.left);
        if(left == -1){
            return -1;
        }
        int right = dfsheight(root.right);
        if(right == -1){
            return -1;
        }
        // if difference in height then tree unbalanced
        if(Math.abs(left-right) > 1){
            return -1;
        }
        // returns the height of the tree
        // +1 for including this level
        return Math.max(left,right)+1;
    }
}
