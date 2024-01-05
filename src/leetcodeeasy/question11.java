package leetcodeeasy;

import java.util.ArrayList;
import java.util.Arrays;
/*
 * Accepted
Runtime
Details
0ms
Beats 100.00%of users with Java
Memory
Details
42.68MB
Beats 94.52%of users with Java
 */
public class question11 {
    public static int searchInsert(int[] nums, int target) {
        int targ=0;
        if (nums.length==0) {
            return -1;
        }
        
        for(int i=0;i<nums.length;i++){
            
            if (nums[i]==target) {
               
                return i;
                
            }else{
                if(target>nums[i]){
                    
                    targ=i+1;
                }
            }
        }
        return targ;
        
    }
    public static void main (String [] args){
        int []x={1,3,5,6};
        System.out.println(searchInsert(x, 2));
    }
}
