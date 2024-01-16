package leetcodeeasy;
//https://leetcode.com/problems/sum-of-left-leaves/
/*
 * Runtime
0ms
Beats100.00%of users with Java
Memory
41.64MB
Beats10.72%of users with Java
 */
public class question82 {
    
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
 

    public int sumOfLeftLeaves(TreeNode root) {
        int i=0;

       if(root==null){
        return 0;
       }
       if(root.left!= null && root.right!=null){
        return sumOfLeftLeaves(root.left)+sumOfLeftLeaves(root.right);
       }
       if(root.right!=null&& root.left==null){
        return 0;
       }
       if(root.left!=null && root.right==null){
        return sumOfLeftLeaves(root.left);
       }
       if(root.left==null &&root.right==null){
        return root.val;
       }

  
}
}
