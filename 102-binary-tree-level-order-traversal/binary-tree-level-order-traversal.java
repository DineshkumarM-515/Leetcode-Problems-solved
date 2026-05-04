class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levelOrder = new ArrayList<>();

        if(root == null) return levelOrder;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> li = new ArrayList<>();
            int size = q.size();
            for(int i=0;i<size;i++){
                TreeNode curr = q.poll();
                li.add(curr.val);

                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }

            levelOrder.add(li);

        }

        return levelOrder;
    }
}