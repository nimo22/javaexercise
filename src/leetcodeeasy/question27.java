package leetcodeeasy;
//todo
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
    boolean valid=false;
    if (root==null) {
            return false;
    }

    int sumleft=root.val;
    int sumright=root.val;//5
    TreeNode decoyleft=root.left;
    TreeNode decoyright=root.right;

    while (decoyleft!=null) {
        sumleft=sumleft+decoyleft.val;

        
    }
    
    return valid;
        
  }
    
}
