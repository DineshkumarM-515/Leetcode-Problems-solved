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
    public int maxLevelSum(TreeNode root) {
        if(root == null) return 0;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        int maxSum = Integer.MIN_VALUE;
        int ans = Integer.MAX_VALUE;
        int level = 0;

        while(!q.isEmpty()){
            int size = q.size();
            level++;
            
            int currSum = 0;
            for(int i=0;i<size;i++){
                TreeNode curr = q.poll();
                currSum += curr.val;
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
                
            }

            if(currSum > maxSum){
                maxSum = currSum;
                ans = level;
            }
        }

        return ans;
    }
}