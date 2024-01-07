package leetcodeeasy;
//https://leetcode.com/problems/symmetric-tree/
public class question21 {
    
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
      public boolean isSymmetric(TreeNode root) {
        boolean res=true;
        if (root==null) {
            return false;   
        }
        if(root.left!=null && root.right==null){
            return false;
        }
         if(root.left==null && root.right!=null){
            return false;
        }
        if(root.left==null && root.right==null){
            return true;
        }else{
            res=res&&isSymmetric(root.left);
            res=res &&isSymmetric(root.right);
        }
       


        
        return res;
      }
    
}
}
