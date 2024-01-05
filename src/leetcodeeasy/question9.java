package leetcodeeasy;

import java.util.ArrayList;
/*
 * Runtime
Details
0ms
Beats 100.00%of users with Java
Memory
Details
41.92MB
Beats 9.62%of users with Java
 */

public class question9 {
    public int removeElement(int[] nums, int val) {
        int response=0;
        ArrayList<Integer> ar= new ArrayList<>();
        for(int i=0; i<nums.length;i++){
            if(nums[i]!=val){
                response++;
                ar.add(nums[i]);
            }
        }
     
        for(int r=0;r<ar.size();r++){
            nums[r]=ar.get(r);
        }

        return response;
    }
    
}
