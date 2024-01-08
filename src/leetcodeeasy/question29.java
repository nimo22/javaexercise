package leetcodeeasy;

import java.util.ArrayList;
import java.util.List;
/*
 * Accepted
Runtime
Details
1ms
Beats 71.73%of users with Java
Memory
Details
41.31MB
Beats 6.77%of users with Java
More challenges
2221. Find Triangular Sum of an Array

 */
//https://leetcode.com/problems/pascals-triangle-ii/
public class question29 {
    // first i need to creat pascal triangle using two list one inside the other with the help of list class
    // the pascal size is decided using the row 
     public List<Integer> getRow(int rowIndex) {
        
        List<List<Integer>>pascal= new ArrayList<>();
        List<Integer>row= new ArrayList<>();
       
        for(int i=0;i<=rowIndex;i++){ // treaky since rown the now start by 0
            row= new ArrayList<>();
            for(int r=0;r<=i;r++){// creating row
                if (r==i ||r==0) {
                    row.add(1);

                    
                }else{
                    row.add(pascal.get(i-1).get(r)+pascal.get(i-1).get(r-1));
                }
            }
            pascal.add(row);
        }





        return pascal.get(rowIndex);
    }

    
}
