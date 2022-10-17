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

// conditions to follow are: 
// 1. left children nodes need to be less than the root node and right children nodes need to be more than the root node. 
// 2. teh absolute difference ebtween the height of the left subtree and right subtree should not be more than 1. 
// 3. At most two children of a node.

//nums = [-10,-3,0,5,9]

//     -10                    -3                 0
//     /  \                   / \               / \
//         -3      =>       -10  0       =>   -3   5
//           \                    \           /     \
//            0                    5        -10      9
//                                  \
//                                   9


// Sorted array we will think in ters of binary search 
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        
        //base case
        if(nums.length == 0){
            return null;
        }
        return NodeFromArray2BSTConverstion(nums, 0, nums.length-1); 
    }
    
    public TreeNode NodeFromArray2BSTConverstion(int[] nums, Integer left, Integer right){
        if(left > right) return null;
        
        int midpoint = left + (right-left)/2;
        
        TreeNode node = new TreeNode(nums[midpoint]);
        
        node.left = NodeFromArray2BSTConverstion(nums, left, midpoint-1);
        node.right = NodeFromArray2BSTConverstion(nums, midpoint+1, right);
        
        return node;
    }
    
}
