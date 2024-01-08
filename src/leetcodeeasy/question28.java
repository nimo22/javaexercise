package leetcodeeasy;

import java.util.ArrayList;
import java.util.List;
/*
 * Accepted
Runtime
Details
1ms
Beats 91.15%of users with Java
Memory
Details
42.24MB
Beats 7.34%of users with Java
 */
//https://leetcode.com/problems/pascals-triangle/
public class question28 {
      public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr = new ArrayList<>();
        List<Integer>inside= new ArrayList<>();
        for(int i=0;i<numRows;i++){
          inside= new ArrayList<>();
          
          for (int r=0;r<=i;r++){
            if(r==i || r==0){
              
              inside.add(1);
              

            }else{
              inside.add(arr.get(i-1).get(r)+arr.get(i-1).get(r-1));
            }

          }
          
          arr.add(inside);
          
        }
        
     
        return arr;
    }
    public static void main(String[] args) {
        generate(5);
    }
}
