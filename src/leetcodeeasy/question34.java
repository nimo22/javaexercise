package leetcodeeasy;
import java.util.*;
/*
 * Accepted
Runtime
Details
0ms
Beats 100.00%of users with Java
Memory
Details
41.59MB
Beats 18.57%of users with Java
 */
public class question34 {
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
public static List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> li= new ArrayList<>();
    if(root==null){
        return li;

    }
    if(root.left==null && root.right==null){
        li.add(root.val);
        return li;
    }
    if(root.right== null){ 
        li.add(root.val);
        li.addAll(preorderTraversal(root.left));
        return li;
    }else if (root.left== null){
        
         li.add(root.val);
        li.addAll(preorderTraversal(root.right));
        return li;
    }else{
        li.addAll(preorderTraversal(root.left));
        li.addAll(preorderTraversal(root.right));
        return li;
    }
      
    }
    public static void main(String[] args) {
        question34 x= new question34();
        TreeNode tree= x.new TreeNode();
        tree.val=1;
        tree.right=x.new TreeNode();
        tree.right.val=2;
        tree.right.left= x.new TreeNode();
        tree.right.left.val=3;

        System.out.println(preorderTraversal(tree));
    }
}

