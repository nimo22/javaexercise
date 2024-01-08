package leetcodeeasy;


import java.util.Arrays;

/*
 * linear 
 * Runtime
Details
10ms
Beats 27.31%of users with Java
Memory
Details
46.18MB
Beats 14.02%of users with Java
 */

//https://leetcode.com/problems/single-number/
public class question32 {
    public int singleNumber(int[] nums) {

        Arrays.sort(nums);
        if (nums.length==1) {
            return nums[0];
        }
        for(int i=0;i<nums.length;i++){
            if(i==1 && nums[i]!=nums[i-1]){
                return nums[i-1];
            }else if(i==nums.length-1 && nums[i]!=nums[i-1]){
                return nums[i];

            }else{
                if ( (i!=0 && i!=nums.length-1 )&&  nums[i]!=nums[i-1] && nums[i]!=nums[i+1]) {
                        return nums[i];
                }
            }
            
                    
                
            }
            return -1;
             
        }
       
       
    }
    

