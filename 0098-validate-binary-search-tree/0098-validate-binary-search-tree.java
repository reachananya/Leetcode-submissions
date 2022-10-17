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
    public boolean isValidBST(TreeNode root) {
        
        return validate(root, null, null);
        
    }
    
    //Recursive function
    public boolean validate(TreeNode root, Integer max, Integer min){
        
        // step 1 - 
        // define the base cases 
        
        //if we have reached the root which is null that means all conditions were followed and we can return true
        
        if(root == null){
            return true;
        }else if (max != null && root.val >= max || min != null && root.val <= min){
            return false;
            
        }else{
            return validate(root.left, root.val, min) && validate(root.right, max, root.val);
        }
        
        //step 2 - 
        // define the recursive calls
        
    }
}