package leetcodeeasy;

import java.util.Arrays;
/*
 * Accepted
nimo22
nimo22
submitted at Jan 12, 2024 03:23
Runtime
6ms
Beats17.28%of users with Java
Memory
45.00MB
Beats35.62%of users with Java
 */
public class question60 {
     public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        
        if (nums.length==0 || nums[0]!=0) {
            return 0;
        }
        if (nums.length==1) {
            if (nums[0]==1) {
                return 0;
            }
            return  1;
        }
        for(int i=0;i<nums.length;i++){
            if(i+1!=nums.length){
                if(nums[i]+1!=nums[i+1]){
                    return nums[i]+1;
                }
            }else{
                    if(nums[i]!=nums[i-1]+1){
                        return nums[i-1]+1;
                    }
                    return nums[i]+1; 
                
            }
        }
       return 1; 
    }
}

     