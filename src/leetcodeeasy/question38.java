package leetcodeeasy;
//https://leetcode.com/problems/majority-element/
import java.util.*;
/*
 * Runtime
15ms
Beats18.45%of users with Java
Memory
48.97MB
Beats45.90%of users with Java
 */
public class question38 {
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> capitalCities = new HashMap<Integer, Integer>();
        
        for(int i=0;i<nums.length;i++){
            if(capitalCities.containsKey(nums[i])){
                capitalCities.replace(nums[i],capitalCities.get(nums[i])+1);
            }else{
                
                capitalCities.put(nums[i],1);
            }
        }
        int big=0;
        int value=0;
       // System.out.println(capitalCities.get(4));
        for (int i : capitalCities.keySet()) {
           
         if(capitalCities.get(i)>big){
            big=capitalCities.get(i);
             value=i;
             
         }
 }
        return value;
     }
     public static void main(String[] args) {
        
        int []x={3,3,4};
        System.out.println(majorityElement(x));

     }
}


