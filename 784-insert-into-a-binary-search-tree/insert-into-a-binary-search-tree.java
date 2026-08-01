/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            root = new TreeNode(val);
            return root;
        }
        TreeNode current = root;
        TreeNode parent = null;
        while (current != null) {
            parent = current;
            if (current.val > val) {
                current = current.left;
            }
            else if (current.val < val) {
                current = current.right;
            }
        }
        if (parent.val > val)
            parent.left = new TreeNode(val);
        else
            parent.right = new TreeNode(val);

        return root;
    }
}