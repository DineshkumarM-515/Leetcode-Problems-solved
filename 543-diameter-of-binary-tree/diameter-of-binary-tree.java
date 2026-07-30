class Solution {
    int diameter = 0;
    public int Height(TreeNode root){
        int leftHeight = 0;
        int rightHeight = 0;

        if(root == null) return 0;

        leftHeight = Height(root.left);
        rightHeight = Height(root.right);
        int curr = leftHeight+rightHeight;

        diameter = Math.max(diameter, curr);

        return 1+Math.max(leftHeight, rightHeight);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0;

        Height(root);

        return diameter;
    }
}