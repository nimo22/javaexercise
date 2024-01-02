package leetcodeeasy;
//https://leetcode.com/problems/palindrome-number/
public class question3 {
    public static boolean isPalindrome(int x) {
        boolean response= false;
        if(x<0){
            return response;
        }
        char []str=(String.valueOf(x)).toCharArray();

        String compar="";
        for(int i=str.length-1;i>-1;i--){

            compar=compar.concat(String.valueOf(str[i]));
        }
        if (Integer.parseInt(compar)==x) {
            response=true;
        }

        return response;
    }
    public static void main(String[] args) {
       System.out.println( isPalindrome(-122));
        
    }
}
