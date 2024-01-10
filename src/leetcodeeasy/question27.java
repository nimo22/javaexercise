package leetcodeeasy;
/*
 * Accepted
Runtime
Details
0ms
Beats 100.00%of users with Java
Memory
Details
42.85MB
Beats 90.78%of users with Java
 */
public class question27 {


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
  public boolean hasPathSum(TreeNode root, int targetSum) {
    
    if (root==null) {
    return false;
    }
    if(targetSum-root.val==0 && root.left==null && root.right==null){
      return true;
    }
   
    if(root.right==null){
      return false || hasPathSum(root.left, targetSum-root.val);

    }else if(root.left == null){
      return false || hasPathSum(root.right, targetSum-root.val);
    }else{
      return false ||hasPathSum(root.left, targetSum-root.val) ||hasPathSum(root.right, targetSum-root.val); 
    }
    

    }
  }
    

