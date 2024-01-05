package leetcodeeasy;

import java.util.Arrays;

public class question5 {
    //https://leetcode.com/problems/longest-common-prefix/
    public static String   longestCommonPrefix(String[] strs) {
        if(strs.length==1){
            return strs[0];
        }
        if(strs.length==0){
            return "";
        }
        Arrays.sort(strs);
        String first= strs[0];
        String seconde = strs[strs.length -1];
        String word="";
        for(int i=0;i<first.length();i++){
            if (first.charAt(i) == seconde.charAt(i)) {
                word=word.concat(String.valueOf(first.charAt(i)));
            }else{
                break;
            }
        }
       
        
        return word;
    }
    
    public static void main(String[] args) {
        String []strs = {"aaaa","aa","aaa","aaaaa"};
        System.out.println(longestCommonPrefix(strs));
    }
}
