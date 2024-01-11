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

        return ar;
    }

    public static void main(String[] args) {
        int []x={9,5,4,2,1,0};
        
        for(int i=0;i<x.length;i++){
            for(int r=0;r<x.length;r++){
                if(x[i]<x[r]){
                    int o=x[i];
                    x[i]=x[r];
                    x[r]=o;

                }
            }
        }
        for (int i : x) {
            System.out.println(i);
        }
        System.out.println(summaryRanges(x));
    }
}

