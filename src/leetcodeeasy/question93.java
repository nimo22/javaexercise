package leetcodeeasy;
//https://leetcode.com/problems/repeated-substring-pattern/
public class question93 {
    public boolean repeatedSubstringPattern(String s) {
        if(s.length()%2!=0){
            return false;
        }
        System.out.println(s.substring(s.length()/2, s.length()));
        if(s.substring(0, (s.length()/2)-1).equals(s.substring(s.length()/2, s.length()-1))){

        return true;
        }else{
            String x="";
            for(int i=0;i<s.length();i++){
                if (x.contains(String.valueOf(s.charAt(i)))) {
                    break;
                    
                }else{
                    x.concat(String.valueOf(s.charAt(i)));
                }
            }
        }


        return false;

    }
}
