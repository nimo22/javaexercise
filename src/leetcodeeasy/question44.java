package leetcodeeasy;
//https://leetcode.com/problems/contains-duplicate/
import java.util.Arrays;
import java.util.HashMap;

public class question44 {
    public boolean containsDuplicate(int[] nums) {

        /*
         * Accepted
nimo22
nimo22
submitted at Jan 11, 2024 05:27
Runtime
31ms
Beats5.71%of users with Java
Memory
58.37MB
Beats24.37%of users with Java
         */
        //HashMap<Integer,Integer>twice=new HashMap();

        // for(int i=0;i<nums.length;i++){
        //     if (twice.containsKey(nums[i])) {
        //         twice.replace(nums[i], twice.get(nums[i])+1);
        //     }else{
        //         twice.put(nums[i], 1);
        //     }
        // }
        // for (int i : twice.values()) {
        //     if (i>1) {
        //         return true;
        //     }
            
        // }

        // return false;

        /*
         * ccepted
nimo22
nimo22
submitted at Jan 11, 2024 05:30
Runtime
20ms
Beats28.03%of users with Java
Memory
55.28MB
Beats73.45%of users with Java
         */
        // Arrays.sort(nums);
        // for (int i : nums) {
        //     System.out.println(i);
        // }
        

        // for(int i=0;i<nums.length;i++){
        //     if (i+1!=nums.length) {
        //         if (nums[i]==nums[i+1]) {
        //            return true; 
        //         }
                
        //     }
        // }
        // return false;

            for(int i=0;i<nums.length-1;i++){
                
                for(int r=i+1;r<nums.length;r++){
                    if (nums[i]==nums[r]) {
                        return true;
                    }
                }
            }

        return false;
    }
    
}
