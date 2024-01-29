package leetcodeeasy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class question87 {
    public static boolean canPartition(int[] nums) {
        if(nums.length==0 ||nums.length== 1)return false;
        if(nums.length==2 ){
            if(nums[0]==nums[1]){
                return true;
            }else{
                return false;
            }
        }

        // some of array must be 0

        int sum=0;
        Arrays.sort(nums);
        
        

        for(int i=nums.length-1;i>=0;i--){
            sum=sum-nums[i];
            System.out.println(sum);
            if(sum<0){
                sum=Math.abs(sum);
            }
            
          
        }



        return sum==0;
          
    }
    public static void main(String[] args) {
        int []x={3,3,3,4,5};
        System.out.println(canPartition(x));
    }
}
