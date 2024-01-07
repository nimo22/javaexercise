package leetcodeeasy;

import java.util.Arrays;

//https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
public class question23 {
    /*
     * Accepted
Runtime
Details
0ms
Beats 100.00%of users with Java
Memory
Details
44.88MB
Beats 5.50%of users with Java
     */
  
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
  public TreeNode sortedArrayToBST(int[] nums) {//[-10,-3,0,5,9]
    if(nums.length==0){
        return null;
    }
    int number =nums.length/2;
    int []left=new int[number];//1
    int []right= new int[nums.length-number-1];//1
    
   left=Arrays.copyOfRange(nums, 0, number);
   if(right.length!=0){

    right=Arrays.copyOfRange(nums, number+1,nums.length );

   }
   
    return new TreeNode(nums[number],sortedArrayToBST(left),sortedArrayToBST(right));
  }

  public static void main(String[] args) {
    //test
    int []nums = {-10,-3,0,5,9};
    
  }

    
}
