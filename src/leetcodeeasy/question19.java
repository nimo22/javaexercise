package leetcodeeasy;
/*
 * Accepted // in comment
Runtime
Details
0ms
Beats 100.00%of users with Java
Memory
Details
41.75MB
Beats 7.17%of users with Java
 */
/*
 * solution 2
 * Accepted
Runtime
Details
4ms
Beats 9.31%of users with Java
Memory
Details
41.40MB
Beats 10.17%of users with Java
 */
import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/binary-tree-inorder-traversal/
public class question19 {
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
      * visit left child first 
      * then when finish go to parent 
      * then go to top
      */
     
      public static List<Integer> inorderTraversal(TreeNode root) {
            ArrayList <Integer> m = new ArrayList<>();
            if(root==null){
                return m;
            }
            if (root.left!=null) {
               m.addAll(inorderTraversal(root.left));
               root.left=null;
               m.addAll(inorderTraversal(root));

   
            }else{
                System.out.println("x");
                m.add(root.val);
                m.addAll(inorderTraversal(root.right));
                

            }
        
        return m;
        
    }
  
  public static void main(String[] args) {
    
    question19 x = new question19();
    TreeNode y = x.new TreeNode();
    y.val=3;
    y.left=x.new TreeNode(1);
    y.right=x.new TreeNode(2);
   //1,3,2
    List <Integer> o= new ArrayList<>();
    o=inorderTraversal(y);
    for (Integer integer : o) {
        System.out.println(integer);
        
    }


  }
}
/*
 * if (root==null) {
            
            return m;
        }else{
            if(root.left!=null){
               m.addAll(inorderTraversal(root.left));
               m.add(root.val);

            }else{
                m.add(root.val);
                m.addAll(inorderTraversal(root.right));
                return m;
                
            }
            if (root.right!=null) {
                m.addAll(inorderTraversal(root.right));

                
            }else{
                m.add(root.val);
                return m;
            }
        }


 */