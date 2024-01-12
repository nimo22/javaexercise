package leetcodeeasy;

import java.util.ArrayList;
import java.util.List;

import leetcodeeasy.question34.TreeNode;

//https://leetcode.com/problems/binary-tree-paths/
public class question57 {
     public List<String> binaryTreePaths(TreeNode root) {
        List<String>liLeft = new ArrayList<>();
        List<String>liRight = new ArrayList<>();
        List<String>ret = new ArrayList<>();
        String wordOne="";
        String wordTwo="";
        if (root==null) {
            return new ArrayList<>();
            
        }else{
            if(root.left==null && root.right==null){
             
                liLeft.add(String.valueOf(root.val));
                return liLeft;
            }else if(root.left==null){
                wordOne=String.valueOf(root.val)+"->"+binaryTreePaths(root.right).get(0);
                liLeft.add(wordOne);
                
                return liLeft;

            }else if(root.right==null){
                System.out.println("ok");
                wordOne=String.valueOf(root.val)+"->";
                liLeft.add(wordOne);
                
                return liLeft;

            }else{

                wordOne=String.valueOf(root.val)+"->";
                for (String string : binaryTreePaths(root.left)) {
                    wordOne=wordOne+string;
                    liLeft.add(wordOne);
                }
                //left then righ
                wordTwo=String.valueOf(root.val)+"->";
                System.out.println();
                 for (String t : binaryTreePaths(root.right)) {
                    System.out.println();
                    
                    liRight.add(wordOne);
                }
                
                
                ret.addAll(liLeft);
                ret.addAll(liRight);
                return ret;
                
            }
        }
        
    }
}
