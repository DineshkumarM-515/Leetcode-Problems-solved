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
    Map<Integer, Integer> map;
    int index;
    public TreeNode build(int[] pre, int st, int end){
        if(st > end){
            return null;
        }
        TreeNode root = new TreeNode(pre[index]);
        int mid = map.get(pre[index]);
        index++;

        root.left = build(pre, st, mid-1);
        root.right = build(pre, mid+1, end);
        return root;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        map = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i], i);
        }

        index = 0;
        return build(preorder, 0, inorder.length-1);
    }
}