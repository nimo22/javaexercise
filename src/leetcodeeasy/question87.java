package leetcodeeasy;

import java.util.Arrays;

public class question87 {
    public boolean canPartition(int[] nums) {
        if(nums.length==0 ||nums.length== 1)return false;
            
        
        int sum=0;
        Arrays.sort(nums);

        int port=nums.length-1;
        System.out.println(sum);
        
        
           

        
        if(sum==0){
            return true;
        }else{
            return false;
        }
        
    }
    
}
