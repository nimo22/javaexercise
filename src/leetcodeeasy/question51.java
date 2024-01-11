package leetcodeeasy;
/*
 * Accepted
nimo22
nimo22
submitted at Jan 11, 2024 08:59
Runtime
0ms
Beats100.00%of users with Java
Memory
41.10MB
Beats21.57%of users with Java
 */
public class question51 {
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
        
       
           public  TreeNode invertTree(TreeNode root) {

            if (root==null) {
                return null;
            }
            if (root.left ==null && root.right==null) {
                return root;
            }else if(root.right==null){
                return new TreeNode(root.val,null,root.left);
            }else if(root.left==null){
                return new TreeNode(root.val,null,root.right);

            }else{
                
                return new TreeNode(root.val,root.right,root.left);
                 
            }

               
           }
       
       public static void main(String[] args) {
        question51 o= new question51();
        
        TreeNode x= o.new TreeNode(4);
        x.left=o.new TreeNode(2);
        x.right=o.new TreeNode(7);
        x.right.right=o.new TreeNode(9);
        x.right.left=o.new TreeNode(6);
        x.left.left=o.new TreeNode(1);
        x.left.right=o.new TreeNode(3);
        
        x= o.invertTree(x);
        System.out.println(x.right.left.val);

       }
}
