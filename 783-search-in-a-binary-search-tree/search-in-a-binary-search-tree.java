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
    public TreeNode searchBST(TreeNode root, int val) {
        if (root .val== val) {
            return root;
        }
        TreeNode current = root;
        TreeNode parent = null;
        while (current != null) {
            if(current.val==val)
            return current;
            if (current.val > val) {
                current = current.left;
            }
            else if (current.val < val) {
                current = current.right;
            }
        }
       return null;
    }
}