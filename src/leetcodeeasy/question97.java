package leetcodeeasy;
//https://leetcode.com/problems/license-key-formatting/
/*
 * Accepted
nimo22
nimo22
submitted at Jan 31, 2024 02:00
Runtime
123ms
Beats22.33%of users with Java
Memory
46.67MB
Beats5.69%of users with Java

 */
public class question97 {
    public static String licenseKeyFormatting(String s, int k) {
        if(s.length()<k){
            return s;
        }
        s=s.replace("-", "");
        int first=s.length()%k;
        String answer="";
        if (first==0) {
            for(int i=0;i<s.length();i++){
                if ((i+1)%k==0 && i!=s.length()-1) {
                   answer=answer+s.charAt(i)+"-"; 
                }else{
                    answer=answer+s.charAt(i);
                }

            }
            
        }else{
                int counter=0;
                boolean fi=true;
            for(int i=0;i<s.length();i++){
                if (fi) {
                  if (i+1==first) {
                    answer=answer+s.charAt(i)+"-";
                    fi=false;
                } else{
                    answer=answer+s.charAt(i);
                } 
                }else{
                
                if ((counter+1)%k==0 && i!=s.length()-1) {
                    answer=answer+s.charAt(i)+"-"; 
                 }else{
                     answer=answer+s.charAt(i);
                     counter++;
                 }
                }

            }

        }


        return answer.toUpperCase();
        
    }

    public static void main(String[] args) {
        System.out.println(licenseKeyFormatting("@2",2));
    }
    
}
