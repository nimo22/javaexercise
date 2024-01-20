package leetcodeeasy;

import java.util.ArrayList;

//https://leetcode.com/problems/third-maximum-number/description/
public class question85 {

    public  static int thirdMax(int[] nums) {
        
        int counter=1;
        int max=Integer.MIN_VALUE;
        ArrayList<Integer> maxlist= new ArrayList<>();
        while (counter<4) {
             max=Integer.MIN_VALUE;
            for(int i=0;i<nums.length;i++){
            if(max<nums[i] && !maxlist.contains(nums[i])){
               // System.out.println(nums[i]);
                max=nums[i];
            } 
        }
         if(max!=Integer.MIN_VALUE){
          //  System.out.println(max);
          maxlist.add(max);
        }

        counter++;
       
        }
         if (maxlist.size()<3) {
              System.out.println(maxlist.size());
            return maxlist.get(maxlist.size()-1);
            
        }
        return max;
    }
    public static void main(String[] args) {
        
        int [] x={1,2};
        System.out.println(thirdMax(x));

    }

    
}
