package leetcodeeasy;

import java.util.ArrayList;
import java.util.List;
/*
 * Accepted
nimo22
nimo22
submitted at Jan 11, 2024 09:18
Runtime
7ms
Beats19.15%of users with Java
Memory
41.29MB
Beats45.01%of users with Java
 */

//https://leetcode.com/problems/summary-ranges/description/
public class question52 {
    public static List<String> summaryRanges(int[] nums) {
        
        List<String>ar= new ArrayList();
        String word="";
        for(int i=0;i<nums.length;i++){
            if(i!=nums.length-1){
                
                if(nums[i]+1==nums[i+1]){
                    if (word.length()==0) {
                        word=String.valueOf(nums[i]);
                    }
                    continue;
                }else{
                    System.out.println(nums[i]);
                    if(word.length()==0){
                        ar.add(String.valueOf(nums[i]));
                    }else{
                        word= word+"->"+String.valueOf(nums[i]);
                        ar.add(word);
                        word="";
                    }
                }
            }else{// last input
                if (word.length()==0) {
                    ar.add(String.valueOf(nums[i]));
                }else{
                    word= word+"->"+String.valueOf(nums[i]);
                    ar.add(word);
                }

            }

        }
    System.out.println();

        return ar;
    }

    public static void main(String[] args) {
        int []x={0,1,2,4,5,7};
        System.out.println(summaryRanges(x));
    }
}

