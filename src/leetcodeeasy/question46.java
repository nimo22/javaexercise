package leetcodeeasy;
/*
 * 
 */
public class question46 {
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
    public int countNodes(TreeNode root) {
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            return 1;
        }
        else if(root.left==null){
            return 1+countNodes( root.right);
        }else if(root.right==null){
            return 1+countNodes( root.left);
        }else{
        return 1+countNodes( root.right)+countNodes(root.left);
        }

        
    }
}
    
}
