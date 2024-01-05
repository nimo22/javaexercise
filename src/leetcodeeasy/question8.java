package leetcodeeasy;
/*
 * Accepted
Runtime
Details
3ms
Beats 12.01%of users with Java
Memory
Details
44.61MB
Beats 19.94%of users with Java
More challenges
27. Remove Element
80. Remove Duplicates from Sorted Array II
2460. Apply Operations to an Array
Runtime
Memory
Notes
Accepted
a few seconds ago
Java
3 ms
44.6 MB

 */
import java.util.ArrayList;
import java.util.Arrays;

public class question8 {
    public static int removeDuplicates(int[] nums) {

        Arrays.sort(nums);
        ArrayList<Integer> ar= new ArrayList<>();

    for(int i=0;i<nums.length;i++){
        if(i==nums.length-1){
          ar.add(nums[i]);  
        }
        else if( nums[i]!=nums[i+1]){
            ar.add(nums[i]);
        }
        
        
    }
    
    for(int i=0;i<ar.size();i++){
        nums[i]=ar.get(i);
    }
    System.out.println(Arrays.toString(nums));
        return ar.size();

    }
   
    
}
