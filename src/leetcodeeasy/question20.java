package leetcodeeasy;

import string.exercice8;
/*
 * Accepted
Runtime
Details
2ms
Beats 100.00%of users with Java
Memory
Details
41.00MB
Beats 16.62%of users with Java
 */

//https://leetcode.com/problems/same-tree/
public class question20 {
   
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
 
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        boolean res=true;
        if(p==null && q==null){
            System.out.println("ok");
            return true;
        }else if(p!=null && q==null){
            return false;
        }else if (p==null && q!=null){
            return false;
        }
        else{
           
        res=isSameTree(p.left, q.left);
                 //returned

        res=res &&isSameTree(p.right, q.right);
            
        }
        return res &&(p.val==q.val);

    }


    public static void main(String[] args) {
        question20 oo= new question20();
        TreeNode x =oo.new  TreeNode();
        TreeNode y =oo.new  TreeNode();
        x.val=1;
        x.left=oo.new  TreeNode(-8);
        y.val=1;
        y.left=oo.new  TreeNode(-5);
       System.out.println(isSameTree(x,y));

    }
}
