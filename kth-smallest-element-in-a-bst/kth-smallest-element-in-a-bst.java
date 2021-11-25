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
    public int kthSmallest(TreeNode root, int k) {
        //initialize an array with two ints
        int[] nums = new int[2];
        inorder(root, nums, k);    //initialize inorder 
        
        return nums[1];
    }
    
    //calling the recursive function 
    public void inorder(TreeNode root, int[] nums, int k){
        //base case
        if( root == null){
            return;
        }
             
        inorder(root.left, nums, k);
        if(++nums[0] == k){
            nums[1] = root.val;
            return;
        }
            
        inorder(root.right, nums, k);
    }
}