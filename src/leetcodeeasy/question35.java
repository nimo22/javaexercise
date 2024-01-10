package leetcodeeasy;
/*
 * Accepted
Runtime
Details
0ms
Beats 100.00%of users with Java
Memory
Details
41.57MB
Beats 17.74%of users with Java
 */
  

 
import java.util.ArrayList;
import java.util.List;

public class question35 {
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
     public List<Integer> postorderTraversal(TreeNode root) {
        List <Integer> ret= new ArrayList<>();
        if(root==null){
            return ret;
        }
        if(root.left==null && root.right==null){
            ret.add(root.val);
            return ret;
        }
        if (root.left==null) {
            ret.addAll(postorderTraversal(root.right));
            ret.add(root.val);
            return ret;

            
        }else if(root.right==null){
            ret.addAll(postorderTraversal(root.left));
            ret.add(root.val);
            return ret;
        }else{
            ret.addAll(postorderTraversal(root.left));
            ret.addAll(postorderTraversal(root.right));
            ret.add(root.val);
            return ret;

        }

    
    }
    
}
