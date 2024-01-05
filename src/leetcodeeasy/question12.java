package leetcodeeasy;
/*
 * 0ms
Beats 100.00%of users with Java
Memory
Details
41.76MB
Beats 9.93%of users with Java
 */
//https://leetcode.com/problems/length-of-last-word/
public class question12 {
    public int lengthOfLastWord(String s) {
        //no word
        if(s.length()==0){
            return 0;
        }
        // move spaces
        s=s.strip();
        if(s.lastIndexOf(" ")==-1){
            return s.length();
        }else{
            return s.substring(s.lastIndexOf(" "), s.length()-1).length();
        }

    }
    
}
