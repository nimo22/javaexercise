package leetcodeeasy;
//https://leetcode.com/problems/maximum-depth-of-binary-tree/
/*
 * Accepted
Runtime
Details
0ms
Beats 100.00%of users with Java
Memory
Details
43.14MB
Beats 6.64%of users with Java
 */
public class question22 {
     public class TreeNode {
            int val;
             TreeNode left;
             TreeNode right;
             TreeNode() {}
             TreeNode(int val) { this.val = val; }
             TreeNode(int val, TreeNode left, TreeNode right) {
                 this.val = val;
                 this.left = left;
                 this.right = right;
             }
         }

     public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        if (root.left == null && root.right==null ) {
                return 1;
        }

       
        return 1+ Math.max(maxDepth(root.right), maxDepth(root.left));
    }
}
