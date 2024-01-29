package leetcodeeasy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
public class question92 {
     public  static List<Integer> findDisappearedNumbers(int[] nums) {
        
        Arrays.sort(nums);
        List<Integer>li= new ArrayList<>();
        for(int i=0;i<nums.length;i++){//[1,2,2,3,3,4,7,8]
            if(i==0 && nums[i]!=1){
                li.add(1);
                nums[0]=1;
            }
            if(i!=nums.length-1){
                if(nums[i]-nums[i+1]!=-1 && nums[i]-nums[i+1]!=0){
                    int number=nums[i];
                  while (number-nums[i+1]!=-1) {
                    li.add(number+1);
                    number++;
                  }  
                }
                }else{
                    if(nums[i]!=nums.length){
                        li.add(nums.length);
                    }
                }
            }


        return li;
    }
    public static void main(String[] args) {
        int []x={1,-1,2,-1};
        System.out.println(findDisappearedNumbers(x));
        
    }
    
}

