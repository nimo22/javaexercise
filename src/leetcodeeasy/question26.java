package leetcodeeasy;
//https://leetcode.com/problems/minimum-depth-of-binary-tree/
public class question26 {
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
        /*
         * 4ms
Beats 74.28%of users with Java
Memory
Details
63.76MB
Beats 5.26%of users with Java
         */
       
           public int minDepth(TreeNode root) {
            if(root==null){
                return 0;
            }
            /*
             *    0
             */
            if(root.left==null){
                return minDepth(root.right)+1;
            } if(root.right==null){
                return minDepth(root.left)+1;
            }
            

            return Math.min(minDepth(root.left), minDepth(root.left))+1;
               
           }
       
}
