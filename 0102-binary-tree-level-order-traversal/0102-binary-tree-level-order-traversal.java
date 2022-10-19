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

//when we don't know the number of contents in a [[],[]] type structure its always good to make a List<List<Integer>> res = new ArrayList<>();
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> res = new LinkedList<>(); 
        
        if(root == null) return res;
        
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        
        while(!q.isEmpty()){
            List<Integer> level = new ArrayList<>();
            int cnt = q.size();
            
            for(int i = 0; i<cnt; i++){
                TreeNode node = q.poll();
                level.add(node.val);
                if(node.left != null){
                    q.add(node.left);
                }
                if(node.right != null){
                    q.add(node.right);
                }
            }
            res.add(level);
        }
        return res;
    }
}