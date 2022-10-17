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

//left subtree should be less than the node and right subtree should be greater 

class Solution {
    public boolean isValidBST(TreeNode root) {
        
        if(root == null) return true;
        
        return validate(root, null, null);
    }
    
    public boolean validate(TreeNode root, Integer max, Integer min){
        if(root == null){
            return true;
        }else if(max != null && root.val >= max || min != null && root.val <= min){
            return false;
        }else{
            return validate(root.left, root.val, min) && validate(root.right, max, root.val);
        }
    }
}