package leetcodeeasy;
//https://leetcode.com/problems/balanced-binary-tree/description/
public class question24 {
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

         public boolean isBalanced(TreeNode root) {
            // found the max depth left
            // found max depth right
            // compare them 
            int left=0;
            int right=0;
            if(root==null){
                return true;
            }
            
            TreeNode leftTree= root.left;
            
            
            TreeNode rightTree= root.right;
            
            if(leftTree!=null){
                while (leftTree!=null) {
                    left++;
                    if (leftTree.left==null) {
                       leftTree=leftTree.right; 
                    }else{
                        leftTree=leftTree.left;
                    }
                }
                
            }
             if(rightTree!=null){
                while (rightTree!=null) {
                    right++;
                    if (rightTree.left==null) {
                       rightTree=rightTree.right; 
                    }else{
                        rightTree=rightTree.left;
                    }
                
            }
            }

        
         if(right==left || right==left+1 ||right+1==left){
                return true;
            }else{
                return false;
            }
    
}
}

