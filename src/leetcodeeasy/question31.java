package leetcodeeasy;
//https://leetcode.com/problems/valid-palindrome/
/*
 * Accepted
Runtime
Details
127ms
Beats 12.09%of users with Java
Memory
Details
45.99MB
Beats 5.05%of users with Java
 */
public class question31 {
    public  static boolean isPalindrome(String s) {
        StringBuilder rev= new StringBuilder();
        s=s.strip().toLowerCase();

        String word="";
        for(int i=0;i<s.length();i++){
          if (Character.isAlphabetic(s.charAt(i))) {
            word=word+s.charAt(i);
            
          }else if(Character.isDigit(s.charAt(i))){
            
            
            //if((i+1<s.length() && (Character.isAlphabetic(s.charAt(i+1))) 
           // ||(i!=0 &&Character.isAlphabetic(s.charAt(i-1) )))){ question inclear
                word=word.concat(String.valueOf(s.charAt(i)));
           // }
          }
        }
        if (word.isEmpty()) {
                return true;
        }
        rev.append(word);
        rev.reverse();
        
        
        return  rev.toString().equals(word);
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome("1b1"));
    }
}

