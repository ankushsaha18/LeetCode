package Intermediate.Tree;

public class DiameterTree543 {
    public int diameterOfBinaryTree(TreeNode root) {
        int[] diameter = new int[1];
        height(root,diameter);
        return diameter[0];
    }
    public int height(TreeNode root,int[] diameter){
        if(root == null){
            return 0;
        }
        int[] lt = new int[1];
        int[] rt = new int[1];
        // height of left subtree
        lt[0] = height(root.left,diameter);
        // height of right subtree
        rt[0] = height(root.right,diameter);
        diameter[0] = Math.max(diameter[0],lt[0]+rt[0]);
        return 1+Math.max(lt[0],rt[0]);
    }
}
