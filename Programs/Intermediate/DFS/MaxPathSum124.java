package Intermediate.DFS;

import Intermediate.Tree.TreeNode;

public class MaxPathSum124 {
    public int maxPathSum(TreeNode root) {
        int[] max = {Integer.MIN_VALUE};
        function(root,max);
        return max[0];
    }
    public int function(TreeNode root,int[] max){
        if(root == null){
            return 0;
        }
        int left = Math.max(0,function(root.left,max));
        int right = Math.max(0,function(root.right,max));
        // update max by adding left right and current
        max[0] = Math.max(max[0],left+right+root.val);
        // return the max sum of the subtree
        return Math.max(left,right) + root.val;
    }
}
